package com;

import java.util.Arrays;

/**
 *
 * @author rokhis
 */
public class BinarySearch {

    public static void binarySearch(int arr[], int f, int l, int key) {
        int tengah = (f + l) / 2;
        while (f <= l) {
            if (arr[tengah] < key) {
                f = tengah + 1;
            } else if (arr[tengah] == key) {
                System.out.println("elemen ketemu di indeks : " + tengah);
                break;
            } else {
                l = tengah - 1;
            }
            tengah = (f + l) / 2;
        }
        if (f > l) {
            System.out.println("Elemen tidak ketemu!");
        }
    }

    public static void main(String[] args) {
        int[] angkaRandom = {12,45,23,1,56,87,22};
        Arrays.sort(angkaRandom);
        int key = 12;
        int l = angkaRandom.length - 1;
        binarySearch(angkaRandom, 0, l, key);

    }
}

