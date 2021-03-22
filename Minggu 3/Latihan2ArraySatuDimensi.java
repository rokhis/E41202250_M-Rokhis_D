/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2arraysatudimensi;

/**
 *
 * @author Rokhis
 */
public class Latihan2ArraySatuDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] angka = {1,3,13,19,21,87};
        String [] teks = {"Tetap", "Semangat", "dan", "Sukses", "Selalu"};
        
        for (int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for (int j=0; j<teks.length; j++){
            System.out.print(teks[j]);
            System.out.print(" ");
    }
    
    }}
