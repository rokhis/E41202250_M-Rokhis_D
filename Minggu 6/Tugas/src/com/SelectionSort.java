package com;

/**
 *
 * @author rokhis
 */
public class SelectionSort {

    static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            // mencari nilai terkecil
            for (int j = i + 1; j < data.length; j++) {
                System.out.println("A: " + data[j - 1] + " > " + "B: " + data[j]);
                if (data[j] < data[index]) {
                    index = j;
                }
            }
            int n_kecil = data[index];
            data[index] = data[i];
            data[i] = n_kecil;
        }

        System.out.print("Array setelah disorting : [ ");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    // lebih simpel
    static void selectionSort2(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                System.out.println("A: " + data[j - 1] + " > " + "B: " + data[j]);
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        System.out.print("Array setelah disorting : [ ");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    // show
    static void show(int[] data) {
        System.out.print("Array sebelum disorting : [ ");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] angkaRandom = {2, 5, 3, 6, 8, 3, 1};
        System.out.println("Angka sebelum di urutkan : ");
        for (int i = 0; i < angkaRandom.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        selectionSort(angkaRandom);
    }
}
