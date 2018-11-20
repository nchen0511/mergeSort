public class Runner {
    public static void main(String[] args){
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*51);
        }

        String display = "";
        for(int i=0;i<array.length;i++){
            display+=array[i] + ", ";
        }
        System.out.println(display);

        mergeSort.mergeSort(array);

        display = "";
        for(int i=0;i<array.length;i++){
            display+=array[i] + ", ";
        }
        System.out.println(display);

    }
}
