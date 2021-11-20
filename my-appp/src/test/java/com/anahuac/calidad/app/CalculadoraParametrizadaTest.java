package com.anahuac.calidad.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.anahuac.calidad.app.Calculadora;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculadoraParametrizadaTest{
    private double arg1;
    private double arg2;
    private double arg3;
    private Calculadora miCalculadora;

    public CalculadoraParametrizadaTest(double arg1, double arg2, double arg3){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {4, 2, 2},
                {6, 3, 2},
                {5, 5, 1},
                {10, 5, 2},
                {10, 0, Double.POSITIVE_INFINITY},
                {0, 0, Double.NaN}
        });
    }

    @Before
    public void setUp() throws Exception {
        miCalculadora = new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divisionAllPosTest() {

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.division(this.arg1, this.arg2);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(this.arg3, is(resultadoEjecucion));
    }
}