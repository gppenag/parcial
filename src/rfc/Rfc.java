/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc;

import java.util.Scanner;

/**
 *
 * @author gipao
 */
public class Rfc {
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        
        System.out.println("nombre");
        String nombre = leer.nextLine();
        System.out.println("\nmaterno");
        String materno= leer.nextLine();
        System.out.println("paterno");
        String paterno= leer.nextLine();
        System.out.println("anacimiento");
        String anacimiento = leer.nextLine();
        System.out.println("1. enero\n 2. febrero");
        String mes = leer.nextLine();
        switch(mes){
            case "1": mes = "01";break;
            case "2": mes = "02";break;    
            default:
                System.out.println("incorrecto");
        }
        System.out.println("dia");
        String dia = leer.nextLine();
       
        //Toma las dos primeras letras sin contar espacio
        System.out.println(paterno.trim().substring(0,2));
        String rfc ="";
        rfc= paterno.trim().substring(0,2);
       // rfc = rfc.concat(materno.trim().substring(0,1);
 
        }
    
}
