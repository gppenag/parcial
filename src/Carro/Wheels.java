/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author gipao
 */
public class Wheels {
    private String nombre;
    private Engire m;

    public Wheels(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Engire getM() {
        return m;
    }

    public void setM(Engire m) {
        this.m = m;
    }
     
    
}
