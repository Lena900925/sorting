public class Select{

    public static void main(String[]args){
        int[] arr1 = {5,3,8,2,9,23,0};
        sortArray(arr1);
    }
    public static void sortArray(int[] array1){
        int n = array1.length;
        for (int i = 0; i < n - 1; i++) {
            int index = n;
            for (int j = i + 1; j < n; j++) {
                if (array1[i] > array1[j]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }

            }
        }
        System.out.println(array1);
    }

}