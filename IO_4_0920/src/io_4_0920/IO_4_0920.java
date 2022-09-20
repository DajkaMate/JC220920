/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_4_0920;

class NegativSzamException extends Exception
{
   private int Szam;
   NegativSzamException(int szam)
   {
       Szam = szam;
   }
   public String toString()
   {
       return "A szám nem lehet negatív" + " " + Szam;
   }
}
     

public class IO_4_0920 {

    static int kerSzam()
    {
        return -9;
    }    
    public static void main(String[] args) throws Exception 
    {
        int szam = kerSzam();
        
        if(szam < 0)
        {
             throw new NegativSzamException(szam);
        }
        else
        {
             System.out.println("A szam: " + szam);
        }
    }
}
