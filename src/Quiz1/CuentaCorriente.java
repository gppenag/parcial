/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

public class CuentaCorriente {

    private double dinero;
    private double retirar;
    public CertificadoDeDeposito certificadoDeDeposito;

    public CuentaCorriente() {
        dinero = 0;
        retirar = 0;
    }

    public CuentaCorriente(double dinero, double retirar, CertificadoDeDeposito certificadoDeDeposito) {
        this.dinero = dinero;
        this.retirar = retirar;
        this.certificadoDeDeposito = certificadoDeDeposito;
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

    public double retirarDineroC() {
        double acumulado;
        acumulado = (dinero + certificadoDeDeposito.cerrar());
        return (acumulado -retirar);
    }
}
