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

    /**
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return resultado
     */
    @Override
    public double sumar(double a, double b) {
        double c = a + b;
        return c;
    }

    /**
     *
     * @param a minuendo
     * @param b sustraendo
     * @return resultado
     */
    @Override
    public double restar(double a, double b) {
        double c = a - b;
        return c;
    }

    /**
     *
     * @param a primer multiplicando
     * @param b segundo multiplicando
     * @return resultado
     */
    @Override
    public double multiplicar(double a, double b) {
        double c = a * b;
        return c;
    }

    /**
     *
     * @param a dividendo
     * @param b divisor
     * @return cociente
     */
    @Override
    public double dividir(double a, double b) {
        double c = a / b;
        return c;
    }
}
