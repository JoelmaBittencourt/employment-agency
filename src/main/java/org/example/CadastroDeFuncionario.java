package org.example;

import javax.swing.plaf.IconUIResource;

public class CadastroDeFuncionario {

    public static void main(String[] args) {
        var endereco = new Endereco("07125", "rua das flores", "47");


        var seguranca = new Seguranca("Jose", "001", 2000.00, endereco);
        System.out.println(seguranca.verificaPorteDeArma(false));
        System.out.println("Salario + bonus de " + seguranca.getNome() + " = " + seguranca.bonusAnual() + seguranca.getEndereco().getCep());


        var gerente = new Gerente("Maria", "001", 2000.00, endereco);
        gerente.bonusAnual();
        gerente.getEndereco().informacoes();
        System.out.println("Salario + bonus de " + gerente.getNome() + " = " + gerente.bonusAnual());


        var faxineira = new Faxineira("Maria", "001", 2000.00, endereco);
        gerente.bonusAnual();
        faxineira.getEndereco().informacoes();
        System.out.println("Salario + bonus de " + faxineira.getNome() + " = " + faxineira.bonusAnual());


        var cordenador = new Cordenador("Maria", "001", 2000.00, endereco);
        gerente.bonusAnual();
        gerente.getEndereco().informacoes();
        System.out.println("Salario + bonus de " + cordenador.getNome() + " = " + cordenador.bonusAnual());

    }
}
