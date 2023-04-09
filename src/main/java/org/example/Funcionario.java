package org.example;

public class Funcionario {

    private String nome;
    private String codigoDeIdentificação;
    private double salario;

    private  Endereco endereco;

    public Funcionario(String nome, String codigoDeIdentificação, double salario, Endereco endereco) {
        this.nome = nome;
        this.codigoDeIdentificação = codigoDeIdentificação;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDeIdentificação() {
        return codigoDeIdentificação;
    }

    public void setCodigoDeIdentificação(String codigoDeIdentificação) {
        this.codigoDeIdentificação = codigoDeIdentificação;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double bonusAnual() {
        return this.salario * 0.1;
    }
    public double bonusAnual(double porcentagemBonus) {
        return this.salario + porcentagemBonus;
    }
}
