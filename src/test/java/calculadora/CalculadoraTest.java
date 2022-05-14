/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
Calculadora calculadora = new Calculadora();
    @org.junit.Test
    public void testSumar() {
        
        double resultado = calculadora.sumar(5.3, 2.8);
        double esperado = 8.1; //  5.3+ + 2.8 = 8.1
        assertEquals(esperado,resultado,0);
    }

    @org.junit.Test
    public void testRestar() {
        double resultado = calculadora.restar(5.3, 2.8);
        double esperado = 2.5; // 5.3-2.8 = 2.5
        assertEquals(esperado,resultado,0);
    }

    @org.junit.Test
    public void testMultiplicar() {
        double resultado = calculadora.multiplicar(5.3, 2.8);
        double esperado = 14.84; // 5.3*2.8 = 14.84
        assertEquals(esperado,resultado,0.01);
    }

    @org.junit.Test
    public void testDividir() {
        double resultado = calculadora.dividir(5.3, 2.8);
        double esperado = 1.89; // 4.3/2.8 = 1.89
        assertEquals(esperado,resultado,0.01);
    }
    
}
