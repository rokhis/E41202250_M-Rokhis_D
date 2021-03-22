/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

import java.util.Scanner;

/**
 *
 * @author Rokhis
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel dan scanner
        String gunung;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print("Inputkan Nama Gunung :");
        gunung = scan.nextLine();
        
        switch (gunung) {
            case "raung":
                System.out.println("Gunung Raung terletak diantara 3 Kabupaten yaitu, Kab. Jember, Kab. Bondowoso, dan Kab. Banyuwangi");
                break;
            case "semeru":
                System.out.println("Gunung Semeru terletak diantara Kab. Lumajang dan Kab. Malang");
                break;
            case "rinjani":
                System.out.println("Gunung Rinjani terletak di Pulau Lombok, Nusa Tenggara Barat");
                break;
            default :
                System.out.println("Nama Gunung Yang Anda Masukkan Salah!");
        }   
    
}}
