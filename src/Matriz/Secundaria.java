/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import java.util.Random;

/**
 *
 * @author gipao
 */
public class Secundaria {
   Random r = new Random(); 
    //lenar matriz
    public void llenarMatriz(int vec[][]){
        for (int i = 0; i < vec.length; i++) {
            for (int j= 0; j < vec[0].length; j++) {
                vec [i][j]= r.nextInt(10);
            }
        }
    }
    
    public void imprimir(int vec[][]){
        for(int i=0; i <vec.length; i++){
            for (int j= 0; j < vec.length; j++){
                System.out.println("  "+vec[i][j]);
            }
        }System.out.println(" ");
    }
    
    
    
    
}
