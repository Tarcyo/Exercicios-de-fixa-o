/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios.de.fixação;

import java.util.Scanner;

/**
 *
 * @author Tarcyo
 */
public class exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.print("digite a ");
        double a=s.nextDouble();
        System.out.print("\ndigite b ");
        double b=s.nextDouble();
        System.out.print("\ndigite c ");
        double c=s.nextDouble();
        double delta=(b*b)-(4*a*c);
        double x1=(((-b+Math.sqrt(delta))/(2*a)));
        double x2=(((-b-Math.sqrt(delta))/(2*a)));
        System.out.print("x1: "+x1+"\nx2: "+x2);
        s.remove();
        
    }
    
}
