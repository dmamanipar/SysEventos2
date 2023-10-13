/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.upeu.asistencia.controllers;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.http.ResponseEntity;
import pe.edu.upeu.asistencia.models.Facultad;

/**
 *
 * @author DELL
 */
public class FacultadControllerTest {
    
    public FacultadControllerTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testListEntidad() {
        System.out.println("listEntidad");
        FacultadController instance = new FacultadController();
        ResponseEntity<List<Facultad>> expResult = null;
        ResponseEntity<List<Facultad>> result = instance.listEntidad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
