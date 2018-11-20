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
        int rightIdx = mid;
        for(int i=left;i<right;i++){
            if(leftIdx==mid){
                temp[i] = arr[rightIdx];
                rightIdx++;
            } else if (rightIdx==right){
                temp[i] = arr[leftIdx];
                leftIdx++;
            } else {
                if (arr[leftIdx] < arr[rightIdx]) {
                    temp[i] = arr[leftIdx];
                    leftIdx++;
                } else {
                    temp[i] = arr[rightIdx];
                    rightIdx++;
                }
            }
        }

        for(int i=left;i<right;i++){
            arr[i] = temp[i];
        }
    }
}
