package com.severinu.searching;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static void main(String[] args) {

        int[] numbers = {52, 16, -2, 8, 152, 832, 2, 23, 98, 121, 233, 91, -20, 101};
        int[] threeLargestNumbers = findThreeLargestNumbers(numbers);
        System.out.println("Input array : " + Arrays.toString(numbers));
        System.out.println("Three largest : " + Arrays.toString(threeLargestNumbers));

    }

    public static int[] findThreeLargestNumbers(int[] array) {
        Integer[] threeLargestNumbers = new Integer[3];
        for(Integer num: array)
            updateLargest(threeLargestNumbers, num);
        return Arrays.stream(threeLargestNumbers).mapToInt( i -> i ).toArray();
    }

    private static void updateLargest(Integer[] threeLargestNumbers, Integer num) {
        if(threeLargestNumbers[2] == null || num > threeLargestNumbers[2])
            shiftAndUpdate(threeLargestNumbers, num, 2);
        else if (threeLargestNumbers[1] == null || num > threeLargestNumbers[1])
            shiftAndUpdate(threeLargestNumbers, num, 1);
        else if (threeLargestNumbers[0] == null || num > threeLargestNumbers[0])
            shiftAndUpdate(threeLargestNumbers, num, 0);
    }

    private static void shiftAndUpdate(Integer[] threeLargestNumbers, Integer num, int idx) {
        for(int i = 0; i <= idx; i++ ) {
            if( i == idx )
                threeLargestNumbers[i] = num;
            else
                threeLargestNumbers[i] = threeLargestNumbers[i +1];
        }
    }

}
