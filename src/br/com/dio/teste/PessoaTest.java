package br.com.dio.teste;

import br.com.dio.main.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(2, pessoa.getIdade());
    }
    @Test
    void validarSeMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Evelin", LocalDate.of(2003, 3, 23));
        Assertions.assertTrue(pessoa.eMaiorDeIdade());
        Pessoa pessoa1 = new Pessoa("Guilherme", LocalDate.now());
        Assertions.assertFalse(pessoa1.eMaiorDeIdade());
    }
    @Test
    void validarLancamentos(){
        int[] primeiroLncamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        int[] terceiroLancamento = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(primeiroLncamento, segundoLancamento);
        Assertions.assertNotEquals(primeiroLncamento, terceiroLancamento);
    }
    @Test
    void validarSeNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
        Pessoa pessoa1 = new Pessoa("Lucas", LocalDate.now());
        Assertions.assertNotNull(pessoa1);
    }
    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double valor1 = 5.0;
        Assertions.assertEquals(valor, valor1);
    }
}