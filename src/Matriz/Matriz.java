/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;


/**
 *
 * @author gipao
 */
public  class Matriz {
    public static void main(String[] args) {
        
        int vec1[][]= {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
        int vec[][]= {{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1},{9,8,7,6,5,4,3,2,1}};
        
        for (int i= 0; i< vec1.length; i++) {
            for (int j = 0; j< vec1.length; j++) {
                System.out.print(" "+vec1[i][j]);  
            } System.out.println("  ");
            for (int c = 0; c < vec.length; c++) {
                System.out.print(" "+vec[i][c]);  
            } System.out.print("\n ");
        }
        
       // Secundaria secundaria = new Secundaria ();
       // secundaria.llenarMatriz(vec[3][3]);
}
}
