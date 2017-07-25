package efficient_sorts.divide_and_conquer_sorts.merge_sort;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class MergeSortWithArrayList {

    public static void main(String[] args) {
        // Use the tests to check your code!
        List<Integer> toSort = Arrays.asList(1, 2345, 234, 84, 22222);

        MergeSortWithArrayList mergeSortObject = new MergeSortWithArrayList();
        mergeSortObject.sort(toSort);
        for (int i : toSort) {
            System.out.println(i);
        }
    }

    public List<Integer> sort(List<Integer> result) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int middle;
        int n = result.size();
        if (n == 1) {
            return result;
        } else {
            middle = n/2;
            for (int i = 0; i < middle; i++) {
                left.add(result.get(i));
            }
            for (int i = middle; i < n; i++) {
                right.add(result.get(i));
            }

            left = sort(left);
            right = sort(right);
            merge(left, right, result);
        }
        return result;
    }

    private static void merge(List<Integer> left, List<Integer> right, List<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        List<Integer> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        for (int i = restIndex; i < rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
}
