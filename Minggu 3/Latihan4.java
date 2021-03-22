/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.util.Scanner;

/**
 *
 * @author Rokhis
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print("Inputkan Nilai: ");
        nilai = scan.nextInt();
        
        //hitung grade
        if (nilai >=90){
            grade = "A";
        } else if (nilai >=80){
            grade = "AB";
        } else if (nilai >=70){
            grade = "B";
        } else if (nilai >=60){
            grade = "BC";
        } else if (nilai >=50){
            grade = "C";
        } else if (nilai >=40){
            grade = "D";
        } else {
            grade = "E";
        }
        
        //cetak hasil
        System.out.println("Grade: "+grade);
    }
    
}
