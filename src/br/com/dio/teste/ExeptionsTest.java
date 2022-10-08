package br.com.dio.teste;

import br.com.dio.main.Pessoa;
import br.com.dio.main.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ExeptionsTest {
    @Test
    void ValidarSenarioDeExeption(){
        Pessoa pessoa = new Pessoa("Guilherme", LocalDate.of(2000, 5, 18));
        Pessoa pessoa1 = new Pessoa("Evelin", LocalDate.of(2003, 3, 23));
         TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.tranferir(pessoa, pessoa1, -1));
    }
    @Test
    void ValidarSenarioDeExeption1(){
        Pessoa pessoa = new Pessoa("Guilherme", LocalDate.of(2000, 5, 18));
        Pessoa pessoa1 = new Pessoa("Evelin", LocalDate.of(2003, 3, 23));
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.tranferir(pessoa, pessoa1, 20));
    }
}
