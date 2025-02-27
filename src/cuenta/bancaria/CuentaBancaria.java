/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

/**
 *
 * @author Edvin Vasquez 
 */
public class CuentaBancaria {
    private String nombre;
    private String apellidos;
    private double saldo;
    private int cuentaMonetaria;
    private int cuentaDeAhorros;
    private int numeroDeCuenta;

    public CuentaBancaria(String nombre, String apellidos, double saldo, int cuentaMonetaria, int cuentaDeAhorros, int numeroDeCuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = Math.max(saldo, 0); // Asegurar que el saldo no sea <0 tiene que ser>0 para que no de negstivo  
        this.cuentaMonetaria = Math.max(cuentaMonetaria, 0);
        this.cuentaDeAhorros = Math.max(cuentaDeAhorros, 0);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void depositarMonetaria(double cantidad) {
        if (cantidad > 0) {
            cuentaMonetaria += cantidad;
            System.out.println("Depósito exitoso en cuenta monetaria. Nuevo saldo es de : " + cuentaMonetaria);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void depositarAhorros(double cantidad) {
        if (cantidad > 0) {
            cuentaDeAhorros += cantidad;
            System.out.println("Depósito exitoso en cuenta de ahorros. Nuevo saldo es de : " + cuentaDeAhorros);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo es de : " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String obtenerNumeroCuenta() {
        return String.valueOf(numeroDeCuenta);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Merly", "Funes", 5000, 600, 600, 1122343);//El cuarto grupo de numeros representa el numero de cuenta 
        cuenta.depositarMonetaria(100);
        cuenta.depositarAhorros(2000);
        cuenta.retirar(2000);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
   

   
            
    

    
    
   

    

