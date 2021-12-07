package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrays = {5, 34, -7, -13, 3, 0};
        System.out.println(Arrays.toString(selectionSort(arrays)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
}
