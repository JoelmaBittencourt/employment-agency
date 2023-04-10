package org.example;


public class CadastroDeFuncionario {

    public static void main(String[] args) {
        var endereco = new Endereco("07125", "rua das flores", "47");


        var seguranca = new Seguranca("Jose", "001", 1000.00, endereco, true);
        seguranca.getInformacoesFuncionario();

        var gerente = new Gerente("Maria", "001", 2000.00, endereco, "senha");
        gerente.bonusAnual();
        System.out.println("Salario + bonus de " + gerente.getNome() + " = " + gerente.bonusAnual());
System.out.println("--------");

        var funcionario = new Funcionario("Saulo", "003", 3.000, endereco);
        funcionario.getInformacoesFuncionario();

    }
}
//protected = public para filhos, quebra o encapsulamento, use get
// e a função do construtor??
// e o super?
//usar o this ou super da no mesmo
//sobrecarga de metodos e construtore= polimorfismo em tempo de compilação