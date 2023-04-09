package org.example;

public class Gerente extends Funcionario{

    private String chaveDeAcesso;


    public Gerente(String nome, String codigoDeIdentificação, double salario, Endereco endereco) {
        super(nome, codigoDeIdentificação, salario, endereco);
    }
}
