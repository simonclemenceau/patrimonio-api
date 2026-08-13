package br.com.senai.patrimonio.model;

public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String estado;

    public Endereco(){
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
