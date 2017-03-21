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
public class CuentaBancaria {

    public Cliente cliente;
    public Cuenta cuenta;

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("nombre");
        String nombre = teclado.next();
        System.out.println("cedula");
        int cedula = teclado.nextInt();
        Cliente cliente = new Cliente(nombre, cedula);
        CertificadoDeDeposito certificadoDeDeposito = new CertificadoDeDeposito(85000,30);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(35000, 10000,certificadoDeDeposito);
        CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(75000,30000);
        Cuenta cuenta = new Cuenta(cuentaDeAhorro,cuentaCorriente,certificadoDeDeposito);
        System.out.println("El saldo total de la cuenta es: "+ cuenta.saldoTotalCuenta());
    }
}
