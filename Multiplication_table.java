/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication_table;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Multiplication_table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the number");
        Scanner input= new Scanner(System.in);
        int max;
        max=input.nextInt();
        for(int i=1; i<=max ;++i)
        {
           for(int j=1; j<max;j++) 
           {
               System.out.print(i*j+ "  ");
           }
           
           System.out.println();
        }
    }
    
}
