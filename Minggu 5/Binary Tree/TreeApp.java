/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Rokhis
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
     public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(13, "Rokhis");
        theTree.insert(27, "Qomar");
        theTree.insert(70, "Samsul");
        theTree.insert(28, "Sodiq");
        theTree.insert(33, "Burhan");
        theTree.insert(10, "Udin");
        theTree.insert(87, "Yayan");
        theTree.insert(3, "Jaelani");
        theTree.insert(31, "Joko");
        theTree.insert(93, "Jamal");
        theTree.insert(19, "Yati");

        while (true) {
            System.out.print("Enter first letter of show, "
                    + "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to " + "insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2, or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid Entry ");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }


    public static int getInt() throws IOException {
       String s = getString();
       return Integer.parseInt(s);
    }
}
