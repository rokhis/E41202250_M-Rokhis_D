/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author Rokhis
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu;
        String jawab;
        String salah;
        String nama;
        Scanner ii = new Scanner(System.in);
        
        System.out.println("               CUAPI CAFE             ");
        System.out.println("            ANEKA MILKSHAKE           ");
        System.out.println("--------------------------------------");
        System.out.println("             SPECIAL MENU :           ");
        System.out.println("          1. Milkshake Stroberi       ");
        System.out.println("          2. Milkshake Melon          ");
        System.out.println("          3. Milkshake Anggur         ");
        System.out.println("          4. Milkshake Taro           ");
        System.out.println("          5. Milkshake Red Velvet     ");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = ii.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = ii.nextLine();
        switch (menu){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Milkshake Stroberi");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("");
                System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cuapi Cafe");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Milkshake Melon");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("");
                System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cuapi Cafe");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Milkshake Anggur");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("");
                System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cuapi Cafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Milkshake Taro");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("");
                System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cuapi Cafe");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Milkshake Red Velvet");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("");
                System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cuapi Cafe");
                break;
            default:
                System.out.println("Silahkan Pilih Sesuai Menu Yang Ada");
    }
    
}}
