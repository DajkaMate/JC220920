/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_2_0920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2_0920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int szam = 0;
        String nev = null;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            System.out.println("Kérek egy számot: ");
            szam = Integer.parseInt(br.readLine());
            
            System.out.println("Kérem a nevét is: ");
            nev = br.readLine();
        } 
        catch (IOException e) 
        {
            System.err.println("HIBA BEOLVASÁSKOR!" + e);   
        }
        
        System.out.println(nev + ", ön a következő számot írta be " + szam);
        int eredmeny = szam * 32;
        System.out.println("A szám 32-szerese " + eredmeny);

        System.out.println("Köszönöm!");
        
        
        
        
    }
    
}
