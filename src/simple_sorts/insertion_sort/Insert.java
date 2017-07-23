package simple_sorts.insertion_sort;

public class Insert {
    public static void main(String[] args) {
        int [] array = {123, 1, 623423, 45, 2342342, 2, 6, 0, 999999};
        insertionSort(array);
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j];
            while (j > 0 && tmp < array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = tmp;
        }
    }

}
