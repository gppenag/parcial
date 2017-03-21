/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReqistroAlumnos;


public class Alumno {
    private String nombre;
    private int matricula;
    private char grupo;
    private int grado;
    
    public Alumno (){
    nombre=" ";
    matricula = 0;
    grupo = ' ';
    grado = 0;
}

    public Alumno(String nombre, int matricula, char grupo, int grado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        this.grado = grado;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno{ " + "nombre=" + nombre + ", matricula=" + matricula + ", grupo=" + grupo + ", grado=" + grado + '}';
    }
}
