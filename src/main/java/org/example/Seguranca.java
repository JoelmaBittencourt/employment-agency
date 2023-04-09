package org.example;

public class Seguranca extends Funcionario {


    public Seguranca(String nome, String codigoDeIdentificação, double salario, Endereco endereco) {
        super(nome, codigoDeIdentificação, salario, endereco);
    }

    public double verificaPorteDeArma(boolean porteDeArma) {
        if (porteDeArma) {
            return this.bonusAnual();
        } else {
            return super.bonusAnual();
        }
    }

    @Override
    public double bonusAnual() {
        return super.bonusAnual() * 1.1;// com this da loop infinito por nao ir ate a classe pai
    }
}
