package org.example;

public class Seguranca extends Funcionario {
    boolean porteDeArma;


    public Seguranca(String nome, String codigoDeIdentificação, double salario, Endereco endereco, boolean porteDeArma) {
        super(nome, codigoDeIdentificação, salario, endereco);
        //this.porteDeArma = porteDeArma;
    }

    @Override
    public void getInformacoesFuncionario() {
        super.getInformacoesFuncionario();
        System.out.println("Porte de arma " + this.porteDeArma);
        System.out.println("-----------------------");
    }
}