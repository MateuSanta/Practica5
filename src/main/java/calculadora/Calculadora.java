/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author carlos
 */
public class Calculadora implements ICalculadora {

    @Override
    public double sumar(double a, double b) {
        double c = a + b;
        return c;
    }

    @Override
    public double restar(double a, double b) {
        double c = a - b;
        return c;
    }

    @Override
    public double multiplicar(double a, double b) {
        double c = a * b;
        return c;
    }

    @Override
    public double dividir(double a, double b) {
        double c = a / b;
        return c;
    }
}
