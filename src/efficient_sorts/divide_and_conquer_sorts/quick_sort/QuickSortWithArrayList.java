package efficient_sorts.divide_and_conquer_sorts.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortWithArrayList {
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(2, 124, 5, 124124, 1441144141, 45, 5, 12300);
        //quickSort(array1);
        for (Integer nums : quickSort(array1)) {
            System.out.println(nums);
        }
    }

    public static List<Integer> quickSort(List<Integer> input) {

        if (input.size() <= 1) {
            return input;
        }

        int middle = input.size() / 2;
        int pivot = input.get(middle);

        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) <= pivot) {
                if (i == middle) {
                    continue;
                }
                less.add(input.get(i));
            } else {
                greater.add(input.get(i));
            }
        }
        return concatenate(quickSort(less), pivot, quickSort(greater));
    }

    private static List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater) {

        List<Integer> list = new ArrayList<>();
        list.addAll(less);
        list.add(pivot);
        list.addAll(greater);
        return list;
    }
}
