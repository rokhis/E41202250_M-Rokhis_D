package com;

public class BubleSorting {

    static void bubbleSortAscending(int[] data) {
        int panjang = data.length;
        int temp = 0;
        for (int i = 0; i < panjang; i++) {
            for (int j = 1; j < (panjang - i); j++) {
                if (data[j - 1] > data[j]) {
                    // swap
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;

                }
            }
        }
    }

    static void bubbleSortDescending(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] < data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] angkaRandom = {2, 5, 3, 6, 8, 3, 1};
        System.out.println("Array sebelum di urutkan : ");
        for (int i = 0; i < angkaRandom.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        bubbleSortAscending(angkaRandom);
        System.out.println("Array setelah di urutkan ascending : ");
        for (int i = 0; i < angkaRandom.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        bubbleSortDescending(angkaRandom);
        System.out.println("Array setelah di urutkan descending : ");
        for (int i = 0; i < angkaRandom.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}


