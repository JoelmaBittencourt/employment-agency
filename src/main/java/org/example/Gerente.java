package org.example;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String nome, String codigoDeIdentificação, double salario, Endereco endereco) {
        super(nome, codigoDeIdentificação, salario, endereco);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

}