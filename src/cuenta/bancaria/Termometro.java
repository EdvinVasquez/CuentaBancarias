/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Termometro;

/**
 *
 * @author Edvin Vasquez
 */


public class Termometro {
    private double temperaturaCelsius;

    public Termometro(double temperaturaInicial) {
        this.temperaturaCelsius = temperaturaInicial;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double convertirAFahrenheit() {        // 
        return (temperaturaCelsius * 9/5) + 32;
    }
    public double convertirAKelvin() {
        return temperaturaCelsius + 273.15;
    }
        //El rango nos servira para medir si se encuentra el clima frio <0,templado>0 <30 y caliente<30 
    
    public String obtenerRango() {
        if (temperaturaCelsius < 0) {
            return "Frío";
        } else if (temperaturaCelsius >= 0 && temperaturaCelsius <= 30) {
            return "Templado";
        } else {
            return "Caliente";
        }
    }

    public String obtenerTemperaturaFinal() {
        return "Celsius: " + temperaturaCelsius + ", Fahrenheit: " + convertirAFahrenheit() + ", Kelvin: " + convertirAKelvin();
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro(30);
        System.out.println("Temperatura en Celsius: " + termometro.getTemperaturaCelsius());
        System.out.println("Temperatura en Fahrenheit: " + termometro.convertirAFahrenheit());
        System.out.println("Temperatura en Kelvin: " + termometro.convertirAKelvin());
        System.out.println("Rango de temperatura: " + termometro.obtenerRango());
        System.out.println("Temperatura Final: " + termometro.obtenerTemperaturaFinal());
    }
}
