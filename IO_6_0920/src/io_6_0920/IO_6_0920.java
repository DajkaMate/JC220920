/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_6_0920;

import java.util.Arrays;
import java.util.Scanner;

public class IO_6_0920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner konzol = new Scanner (System.in);
        int i;
        int[] tomb = new int[5];
        for (i = 0; i < 4 ; i++) 
        {
            System.out.print(i+". Kérek egy számot: ");
            tomb[i] = konzol.nextInt();
        }
        System.out.print("Köszönöm! ");
        int osszeg = Arrays.stream(tomb).sum();
        System.out.println("Az összegük: " + osszeg);
        konzol.close();
        
        
    }
    
}
