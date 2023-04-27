/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author alumno
 */
public class ArbolTest {
    
    Arbol pequeno;
    Arbol grande;
    Arbol grande2;
    public ArbolTest() {      
    }
    
    @Before
    public void setUp() {
        pequeno = new Arbol(0.5,null);
        grande = new Arbol(20.5,null);
        grande2 = new Arbol(20.5,null);        
    }
    @Test
    public void esMayorTest() {
        String otroObjeto = "";
        assertFalse("No funciona cuando el objeto comparado es de otra clase.",pequeno.esMayor(otroObjeto));
        assertFalse("No funciona cuando el objeto comparado es null.",pequeno.esMayor(null));
        assertFalse("No funciona al comparar el objeto con si mismo",pequeno.esMayor(pequeno));
        assertFalse("El objeto comparado es igual.",grande.esMayor(grande2));
        assertFalse("El objeto comparado es mas pequeno.",pequeno.esMayor(grande));
        assertTrue("El objeto comparado es mayor.",grande.esMayor(pequeno));
    }

    @Test
    public void esMenorTest() {
        String otroObjeto = "";
        assertFalse("No funciona cuando el objeto comparado es de otra clase.",pequeno.esMenor(otroObjeto));
        assertFalse("No funciona cuando el objeto comparado es null.",pequeno.esMenor(null));
        assertFalse("No funciona al comparar el objeto con si mismo",pequeno.esMenor(pequeno));
        assertFalse("El objeto comparado es igual.",grande.esMenor(grande2));
        assertFalse("El objeto comparado es mayor.",grande.esMenor(pequeno));
        assertTrue("El objeto comparado es mas pequeno.",pequeno.esMenor(grande));
    }

    @Test
    public void esIgualTest() {
        String otroObjeto = "";
        assertFalse("No funciona cuando el objeto comparado es de otra clase.",pequeno.esIgual(otroObjeto));
        assertFalse("No funciona cuando el objeto comparado es null.",pequeno.esIgual(null));        
        assertFalse("El objeto comparado es mayor.",grande.esIgual(pequeno));
        assertFalse("El objeto comparado es mas pequeno.",pequeno.esIgual(grande));
        assertTrue("No funciona al comparar el objeto con si mismo",pequeno.esIgual(pequeno));
        assertTrue("El objeto comparado es igual.",grande.esIgual(grande2));
    }    
    
}