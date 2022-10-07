package br.com.dio.teste;

import br.com.dio.main.BancoDeDados;
import br.com.dio.main.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void inserirDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDate.now()));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
        System.out.println("Teste 1");
    }
    @Test
    void validarDadosParaTeste(){
        Assertions.assertTrue(true);
        System.out.println("Teste 2");
    }
    @AfterEach
    void removerDados(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDate.now()));
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
