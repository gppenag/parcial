/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReqistroAlumnos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.println("Cuantos alumnos hay");
        n = leer.nextInt();
        leer.nextLine();
        Alumno a[] = new Alumno[n];

        //a[0].setMatricula(12);
        String nombre = " ";
        int matricula = 0;
        char grupo = ' ';
        int grado = 0;
     
        for (int i= 0; i< a.length ;i++) {
            System.out.println("Ingresa tu nombre");
            nombre = leer.nextLine();
            System.out.println("Ingresa tu matricula");
            matricula = leer.nextInt();
            System.out.println("Ingresa tu grupo");
            //toma unicamente el primer caracter
            grupo = leer.next().charAt(0);
            System.out.println("Ingresa tu grado");
            grado = leer.nextInt();
            leer.nextLine();
            a[i]= new Alumno(nombre,matricula,grupo,grado);
        }
        for (Alumno a1 : a) {
            System.out.println(a1);
        }
        
    }


}
