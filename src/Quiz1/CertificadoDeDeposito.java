/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

public class CertificadoDeDeposito {

    private double inversion;
    private double interes;

    public CertificadoDeDeposito() {
        inversion = 0;
        interes = 0;
    }

    public CertificadoDeDeposito(double inversion, double interes) {
        this.inversion = inversion;
        this.interes = interes;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double interesCDT() {
        return (inversion * (interes / 100));
    }

    public double cerrar() {
        double totalCDT;
        totalCDT = inversion - (inversion * (interes / 100));
        return totalCDT;
    }
}
