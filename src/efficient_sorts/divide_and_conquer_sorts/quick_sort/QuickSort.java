package efficient_sorts.divide_and_conquer_sorts.quick_sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr1 = {123,512,5,1,989898,121};
        int left = 0;
        int right = arr1.length - 1;
        partition(arr1, left, right);
        quickSort(arr1, left, right);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}
