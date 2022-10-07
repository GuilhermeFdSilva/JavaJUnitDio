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
}