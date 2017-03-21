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
public class Main {

    public static void main(String[] args) {
        Wheels[] front = new Wheels[2];
        front[0] = new Wheels("front1");
        front[1] = new Wheels("front2");
        Wheels[] rear = new Wheels[2];
        rear[0] = new Wheels("rear1");
        rear[1] = new Wheels("rear2");
        Car car = new Car(front, rear);
    }
}
