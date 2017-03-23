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
public class ConjuntoLibros {

    private Libro[] libros;
    int numLibros = 0;

    public ConjuntoLibros(Libro[] libros) {
        this.libros = libros;
    }

    public void mostrarConj() {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i].getTitulo() + " " + libros[i].getAutor() + " " + libros[i].getCalif() + " " + libros[i].getPag());
            }
        }
    }

    public void organizarCalif() {

        for (int i = 0; i < numLibros; i++) {
            for (int j = 0; j < (numLibros) - 1; j++) {
                if (libros[j].getCalif() > libros[j + 1].getCalif()) {
                    Libro li = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = li;
                }
            }
        }
        if (numLibros > 0) {
            System.out.println(" El libro con mayor calificacion es " + libros[numLibros - 1].getTitulo());
            System.out.println(" El libro con menor calificacion es " + libros[0].getTitulo());
        } else {
            System.out.println("no existen libros en la coleccion");
        }
    }

    public void añadirLibro(Libro l) {
        
        if (numLibros == 10) {
                System.out.println("La coleecion esta llena");
                return ;
            }
        
        for ( int i = 0; i < numLibros; i++ ) {
            if (l.getTitulo().equals(libros[ i ].getTitulo()) && l.getAutor().equals(libros[ i ].getAutor())) {
                System.out.println("El libro ya existe");
                  return ;
            } 
        }

                this.libros[numLibros++] = l;
            
       
    }

}
