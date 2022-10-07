package br.com.dio.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private final String nome;
    private final LocalDate nascimento;
    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }
    public boolean eMaiorDeIdade(){
        return getIdade() >= 18;
    }
}
