package org.example;

public class Seguranca extends Funcionario {
boolean porteDeArma;

    public Seguranca(String nome, String codigoDeIdentificação, double salario, Endereco endereco) {
        super(nome, codigoDeIdentificação, salario, endereco);
    }
    @Override
    public void getInformacoesFuncionario(){
        super.getInformacoesFuncionario();
        System.out.println("Porte de arma " + this.porteDeArma);
        System.out.println("-----------------------");
    }
}
