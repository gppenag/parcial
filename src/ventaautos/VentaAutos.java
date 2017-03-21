/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaautos;

import java.util.Scanner;

/**
 *Se paga al personal de ventas 
 * salario 3200
 * comision 150 por cada carro vendido
 * mas 5% del valor de venta del carro 
 *CALCULA E IIMPRIME EL SALARIO MENSUAL DE UN VENDEDOR DADO
 */
public class VentaAutos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

  
        System.out.println("Nombre");
        String nombre = leer.nextLine();
        Vendedor vendedor = new Vendedor(nombre); 
        
        System.out.println("Deseas iniciar \n s:Si \n n: No");
        String opcion = leer.nextLine();
        Opcion opcioni = new Opcion(opcion);
        
        System.out.println("Ingresa el valor del auto");
        double valor = leer.nextDouble();
       
        Auto auto = new Auto(valor);
        
        }
    }
