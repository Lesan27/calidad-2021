package com.anahuac.calidad.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.anahuac.calidad.app.Calculadora;

public class CalculadoraTest {

    private Calculadora miCalculadora;

    @Before
    public void setUp() throws Exception {
        miCalculadora = new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumaTest() {
        //set el resultado esperado
        double resultadoEsperado = 4;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.suma(2.0f, 2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(closeTo(resultadoEjecucion, .01)));
    }

    @Test
    public void restaTest() {
        //set el resultado esperado
        double resultadoEsperado = 10;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.resta(15.0f, 5.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(closeTo(resultadoEjecucion, .01)));
    }

    @Test
    public void divisionAllPosTest() {
        //set el resultado esperado
        double resultadoEsperado = 10;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(20.0f, 2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionDivNegTest() {
        //set el resultado esperado
        double resultadoEsperado = -10;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(-20.0f, 2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionDivisorNegTest() {
        //set el resultado esperado
        double resultadoEsperado = -10;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(20.0f, -2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionAllNegTest() {
        //set el resultado esperado
        double resultadoEsperado = 10;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(-20.0f, -2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionEntreSi() {
        //set el resultado esperado
        double resultadoEsperado = 1;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(2.0f, 2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionEntreCero() {
        //set el resultado esperado
        double resultadoEsperado = Double.POSITIVE_INFINITY;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(2.0f, 0.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test (expected = ArithmeticException.class)
    public void divisionEnteraTest() {
        //set el resultado esperado
        int resultadoEsperado = 2;

        // ejercicio a probar
        int resultadoEjecucion = miCalculadora.divisionEntera(10, 5);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    /*


    @Test
    public void multiplicacion() {
    }

    @Test
    public void division() {
    }

    @Test
    public void getUltimaResultado() {
    }
    */
}