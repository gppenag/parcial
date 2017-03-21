/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;


public class Car {
    private Wheels [] front;
    private Wheels [] rear;
    private Engire m;

    public Car(Wheels[] front, Wheels[] rear) {
        this.front = front;
        this.rear = rear;
        this.m = new Engire("efgrgr");
        this.m.setAxle(rear);
    }

    public Wheels[] getFront() {
        return front;
    }

    public void setFront(Wheels[] front) {
        this.front = front;
    }

    public Wheels[] getRear() {
        return rear;
    }

    public void setRear(Wheels[] rear) {
        this.rear = rear;
    }

    public Engire getM() {
        return m;
    }

    public void setM(Engire m) {
        this.m = m;
    }
    
    public void imprimir (){
        System.out.println("motor "+ m.getNombre());
        System.out.println("Llantas "+rear[0].getNombre()+" "+rear[1].getNombre());
    }
    
    
}
