/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3arrayduadimensi;

/**
 *
 * @author Rokhis
 */
public class Latihan3ArrayDuaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] angka = {{1,3,4,5,6},{3,1,2,4,7},{2,4,8,7,9}};
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(angka [baris][kolom]+" ") ;
        }
            System.out.println("");
        }
    }
    
}
