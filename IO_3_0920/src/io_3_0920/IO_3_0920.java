/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_3_0920;

import java.io.IOException;
import java.util.Scanner;

public class IO_3_0920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        Scanner be = new Scanner(System.in);
        double c = 0;
        
        int a = be.nextInt();
        try 
        {
            c = 50 / a;
        } catch (Exception e) 
        {
            if (e instanceof ArithmeticException)
            {
                System.out.println("Osztás 0-val");
            }
        }
        System.out.printf("%f\n", c);
        
        System.out.println("Folytatáshoz nyomj egy billentyűt!");
        System.in.read();
   
    }
    
}
