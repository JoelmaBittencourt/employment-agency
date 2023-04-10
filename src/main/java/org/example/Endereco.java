package org.example;

public class Endereco {

    private String cep;
    private String rua;
    private String numero;
    private String complemento;

    public Endereco(String cep, String rua, String numero) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }


    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void getInformacoesEndereco(){
        System.out.println("Cep: "+ getCep() );
        System.out.println("Rua: "+ getRua());
        System.out.println("Numero: "+ getNumero());
        System.out.println("Complemento "+ getComplemento());
    }
}
