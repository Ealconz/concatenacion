/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Concatenacion {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Introduzca su nombre ");
        String i;
        String a;
        i=ent.nextLine();
        System.out.println("Introduzca sus apellidos");
        a=ent.nextLine();
        System.out.println(i+" "+a);
    }
    
}
