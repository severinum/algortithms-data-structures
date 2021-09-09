package com.severinu.searching;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {
        int[] numbers = {0, 5, 8, 12, 23, 23, 28, 31, 67, 90, 101};
        int target = 8;
        int foundAtIndex = binarySearch(numbers, target);
        System.out.println("Index for number " + target + " found: " + foundAtIndex);

        target = 31;
        foundAtIndex = binarySearch(numbers, target);
        System.out.println("Index for number " + target + " found: " + foundAtIndex);

        target = 0;
        foundAtIndex = binarySearch(numbers, target);
        System.out.println("Index for number " + target + " found: " + foundAtIndex);

        target = 95;
        foundAtIndex = binarySearch(numbers, target);
        System.out.println("Index for number " + target + " found: " + foundAtIndex);
    }

    private static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length -1);
    }

    private static int binarySearchHelper(int[] array, int target, int left, int right) {
        if(left > right)
            return -1;

        int middle = (left + right) / 2;
        int potentialMatch = array[middle];

        if(target == potentialMatch)
            return middle;
        else if (target < potentialMatch)
            return binarySearchHelper(array, target, left, middle - 1);
        else
            return binarySearchHelper(array, target, middle + 1, right);
    }

}
