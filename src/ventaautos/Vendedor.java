/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaautos;

import java.util.ArrayList;

public class Vendedor {

    private String nombre;
    private double comision;
    private double salario;
    
    //ArrayList<Auto> autos;


    public void bono(Auto a,Opcion o) {
        if(o. getOpcion().equalsIgnoreCase("s")){
        double c = a.getValor() * 0.05;
        comision += 150 + c;
    }  
    }
    
    
    public Vendedor(String nombre, double salario) {
        this.nombre = nombre;
        this.salario
        comision = 0;
    }
    
      //  autos = new ArrayList<>();

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
