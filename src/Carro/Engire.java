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
public class Engire {
    private Wheels [] axle;
    private String nombre;

    public Engire(String nombre) {
        this.nombre = nombre;
    }

    public Wheels[] getAxle() {
        return axle;
    }

    public void setAxle(Wheels[] rear) {
        this.axle = rear;
        rear[0].setM(this);
        rear[1].setM(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
