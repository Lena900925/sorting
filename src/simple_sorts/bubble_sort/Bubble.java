package simple_sorts.bubble_sort;

public class Bubble {

    public static void main(String[] args) {
        int[] array1 = {40, 20, 3464, 0, 2342, 9};
        bubbleSort(array1);
        for (int number : array1) {
            System.out.println(number);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
