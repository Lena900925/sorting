package efficient_sorts.divide_and_conquer_sorts.quick_sort;

public class QuickSortWithArray {

    public static void main(String[] args) {
        int[] arr1 = {123, 512, 5, 1, 989898, 121, 1};
        int low = 0;
        int high = arr1.length - 1;
        quickSort(arr1, low, high);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        // pick the pivot
        int middle = (low + high) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

}
