package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};

    }

    public int[] generateNumbers(int length) {
            if (length <= 0) {
                throw new IllegalArgumentException("Length must be greater than 0");
            }

            int[] result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = i + 1;
            }
            return result;
        }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index++] = arr[i];
        }
        return reversedArray;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }

        int[] positiveNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[index++] = num;
            }
        }

        return positiveNumbers;
    }
     public int[][] sortRaggedArray(int[][] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j].length > arr[j + 1].length) {
                        int[] temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    for (int k = 0; k < arr[i].length - j - 1; k++) {
                        if (arr[i][k] > arr[i][k + 1]) {
                            int temp = arr[i][k];
                            arr[i][k] = arr[i][k + 1];
                            arr[i][k + 1] = temp;
                        }
                    }
                }
            }

            return arr;
        }
}
