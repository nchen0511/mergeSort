public class mergeSort {
    public static void  mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSortHelper(arr,0,arr.length-1,temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int leftIdx = left;
        int rightIdx = mid+1;
        int tempIdx = left;

        while(leftIdx<=mid&&rightIdx<=right){
            if(arr[leftIdx]<=arr[rightIdx]){
                temp[tempIdx] = arr[leftIdx];
                leftIdx++;
            } else {
                temp[tempIdx] = arr[rightIdx];
                rightIdx++;
            }
            tempIdx++;
        }

        while(leftIdx<=mid){
            temp[tempIdx] = arr[leftIdx];
            leftIdx++;
            tempIdx++;
        }

        while(rightIdx<=right){
            temp[tempIdx] = arr[rightIdx];
            rightIdx++;
            tempIdx++;
        }

        for(int i=left;i<=right;i++){
            arr[i] = temp[i];
        }
    }
}
