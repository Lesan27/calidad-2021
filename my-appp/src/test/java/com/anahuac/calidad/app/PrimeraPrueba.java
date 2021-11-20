package com.anahuac.calidad.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeraPrueba {

    @Before
    public void setUp() throws Exception {
        System.out.println("Este es el before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Este es el after");
    }

    @Test
    public void Primertest() {
        System.out.println("test 1");
        fail("Not implemented yet");
    }

    @Test
    public void Segundotest() {
        System.out.println("test 2");
        fail("Not implemented yet");
    }

    @Test
    public void Tercerotest() {
        System.out.println("test 3");
        fail("Not implemented yet");
    }

    public void otroMetodo() {
        System.out.println("Hi");
    }
}