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
public class Cuenta {
    public CuentaDeAhorro cuentaDeAhorro;
    public CuentaCorriente cuentaCorriente;
    public CertificadoDeDeposito certificadoDeDeposito;

    public Cuenta(CuentaDeAhorro cuentaDeAhorro, CuentaCorriente cuentaCorriente, CertificadoDeDeposito certificadoDeDeposito) {
        this.cuentaDeAhorro = cuentaDeAhorro;
        this.cuentaCorriente = cuentaCorriente;
        this.certificadoDeDeposito = certificadoDeDeposito;
    }

    public double saldoTotalCuenta(){
    double total =((cuentaCorriente.retirarDineroC())+(cuentaDeAhorro.retirarDineroA())+(certificadoDeDeposito.cerrar()));
    return total;
    }
    
    public void intereses (){
    double totali = ((cuentaDeAhorro.interesA())+certificadoDeDeposito.interesCDT());
    System.out.println("Debes pagar en intereses "+ totali);
    double totalp = (6+(certificadoDeDeposito.getInteres()));
    System.out.println("Debes pagan "+ totalp+ "porcentaje en intereses");
    }
}
