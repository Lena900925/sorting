package efficient_sorts.divide_and_conquer_sorts.merge_sort;

public class MergeSortWithArray {

    public static void main(String[] args) {

        int[] array = {0, 123, 45, 36, 8888, 0, 23423, 23423423, 856, 45};

        int n = array.length;
        int left = 0;
        int right = n - 1;

        mergeSort(array, left, right);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        int middle = (left + right) / 2;
        if (left < right) {
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int Left[] = new int[n1];
        int Right[] = new int[n2];


        for (int i = 0; i < n1; i++) {
            Left[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            Right[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}
