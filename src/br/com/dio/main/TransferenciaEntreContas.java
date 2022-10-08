package br.com.dio.main;

public class TransferenciaEntreContas {
    public void tranferir(Pessoa origem, Pessoa destino, double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
    }
}
