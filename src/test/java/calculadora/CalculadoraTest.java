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
        
        double resultado = calculadora.sumar(4.0, 2.0);
        double esperado = 6.0; //  4+ + 2 = 6
        assertEquals(esperado,resultado,0);
    }

    @org.junit.Test
    public void testRestar() {
        double resultado = calculadora.restar(4.0, 2.0);
        double esperado = 2.0; // 4-2 = 2
        assertEquals(esperado,resultado,0);
    }

    @org.junit.Test
    public void testMultiplicar() {
        double resultado = calculadora.multiplicar(4.0, 2.0);
        double esperado = 8.0; // 4*2 = 8
        assertEquals(esperado,resultado,0);
    }

    @org.junit.Test
    public void testDividir() {
        double resultado = calculadora.restar(4.0, 2.0);
        double esperado = 2.0; // 4/2 = 2 
        assertEquals(esperado,resultado,0);
    }
    
}
