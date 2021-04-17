package com;

import java.util.Arrays;

/**
 *
 * @author rokhis
 */
public class SequentialSearch {

    static void sequentialSearch(int[] dataArray, int target) {
        int index = 0;
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == target) {
                index = i;
            }
        }
        System.out.println("Data berada pada index : " + index);
    }

    public static void main(String[] args) {

        int[] angkaRandom = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(angkaRandom);
        sequentialSearch(angkaRandom, 4);

    }
}


