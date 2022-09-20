/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_5_0920;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IO_5_0920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("Kérek több számot vesszővel elválaszva:\n");
        String sor = konzol.next(); 
        
        //darabolás 1
        StringTokenizer st = new StringTokenizer(sor, ",");
        int db = st.countTokens();
        int osszeg = 0;
        while(st.hasMoreTokens())
        {
            osszeg += Integer.parseInt(st.nextToken());
        }
        System.out.println("A beolvasott számok "+db+"db");
        System.out.println("Összegük "+osszeg);
        konzol.close();
        
        //darabolás 2
        int osszeg2 = 0;
        String[] darabok = sor.split(",");
        for (int i = 0; i < darabok.length; i++) 
        {
            osszeg2 += Integer.parseInt(darabok[i]);
        }
        System.out.println("Összegük másként feldolgozva: " +osszeg2);
        
        
        
    }
    
}
