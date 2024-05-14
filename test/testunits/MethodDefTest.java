/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testunits;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author skubjana
 */
public class MethodDefTest {
    MethodDef md = new MethodDef();
    
    public MethodDefTest() {
    }

    @Test
    public void testGetMessage() {
        
        String expected = "Test the app";
        
        String actual = md.getMessage();
        
        assertEquals(expected, actual);
        
    }
    
}
