package org.example;


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



    }
}
//protected = public para filhos, quebra o encapsulamento, use get
