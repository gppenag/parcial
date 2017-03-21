/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author gipao
 */
public class CuentaDeAhorro {

    private double dinero;
    private double retirar;

    public CuentaDeAhorro() {
        dinero = 0;
        retirar = 0;
    }

    public CuentaDeAhorro(double dinero, double retirar) {
        this.dinero = dinero;
        this.retirar = retirar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double interesA() {
        return (dinero * 0.006);
    }

    public double retirarDineroA() {
        double acumulado;
        acumulado = (dinero - interesA());
        return (retirar - acumulado);
    }

}
