/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_1_0920;

import java.util.Scanner;

public class IO_1_0920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        int szam = konzol.nextInt();
        
        System.out.print("Kérem a nevét is: ");
        String nev = konzol.next();
            
        System.out.println(nev + ", ön a következő számot írta be " + szam);
        int eredmeny = szam * 32;
        System.out.println("A szám 32-szerese " + eredmeny);
        konzol.close();
        
        System.out.println("Köszönöm!");
        
        
        
    }
    
}
