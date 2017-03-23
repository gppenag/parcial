/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author gipao
 */
public class PruebaLibros {

    public static void main(String[] args) {

        Libro[] libros = new Libro[10];
        ConjuntoLibros books = new ConjuntoLibros(libros);

        libros[0] = new Libro("Alice in Wonderlnd", "Lewis Carroll");
        libros[0].setPag(320);
        libros[0].setCalif(8);
        
        libros[1] = new Libro("El metodo Lean Startup", "eric Ries");
        libros[1].setPag(700);
        libros[1].setCalif(7);
        
        books.añadirLibro(libros[0]);
        books.añadirLibro(libros[1]);

        books.mostrarConj();
        books.organizarCalif(); 
        libros[1].setCalif(8);
        libros[2] = new Libro("Alice in Wonderlnd", "Lewis Carroll");
        libros[2].setPag(320);
        libros[2].setCalif(8);
        books.añadirLibro(libros[2]);

    }
}
