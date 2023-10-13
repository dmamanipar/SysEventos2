/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.upeu.asistencia.controllers;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pe.edu.upeu.asistencia.models.Periodo;
import pe.edu.upeu.asistencia.services.PeriodoService;


/**
 *
 * @author DELL
 */

@ExtendWith(MockitoExtension.class)
public class PeriodoControllerTest {


    Periodo periodo;

    @Mock
    private PeriodoService periodoService;

    @InjectMocks
    private PeriodoController controller;

    @BeforeEach
    public void setUp() {
        periodo = Periodo.builder()
                .id(1L)
                .nombre("2024-1")
                .estado("Activo")
                .build();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    void testListarPeriodo(){
        List<Periodo> periodos = Arrays.asList(
                periodo,
                Periodo.builder()
                        .id(2L)
                        .nombre("2024-2")
                        .estado("Activo")
                        .build()
        );

        given(periodoService.findAll()).willReturn(periodos);
        ResponseEntity<List<Periodo>> response = controller.listPeriodo();
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals(periodos, response.getBody());

    }

}
