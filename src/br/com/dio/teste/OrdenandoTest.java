package br.com.dio.teste;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenandoTest {
    @Order(4)
    @Test
    void ValidaFluxoA(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void ValidaFluxoB(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void ValidaFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void ValidaFluxoD(){
        Assertions.assertTrue(true);
    }
}
