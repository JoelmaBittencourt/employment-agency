package org.example;

public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, String codigoDeIdentificação, double salario, Endereco endereco, String senha) {
        super(nome, codigoDeIdentificação, salario, endereco);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public double bonusAnual() {
        return super.getSalario() * 1.2;
    }
}