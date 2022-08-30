package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {200, 32, 11, 121, 1200, 3};
        boolean keepChecking = true;

        while(keepChecking) {
            keepChecking = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                    keepChecking = true;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}