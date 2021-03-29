/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangangenap;

import java.util.Scanner;

/**
 *
 * @author Rokhis
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int genap;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka Bilangan Genap = ");
        genap= keyboard.nextInt();

        for(int i=2; i<=genap; i+=2){
            System.out.print(i + " ");
        }
    }
    
}
