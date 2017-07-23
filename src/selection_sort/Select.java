package selection_sort;

public class Select {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 2, 9123, 2525, 11111111, 23, 0};
        for (int number : sortArray(arr1)) {
            System.out.println(number);
        }
    }

    public static int[] sortArray(int[] array1) {
        int n = array1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array1[i] > array1[j]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }

            }
        }
        return array1;
    }
}