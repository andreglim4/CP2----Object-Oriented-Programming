package br.com.fiapdelivery.model;

public class Pacote {
    private String codigoRastreio;
    private double peso;
    private String status;

    public Pacote(String codigoRastreio, double peso) {
        this.codigoRastreio = codigoRastreio;
        this.peso = peso;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getCodigoRastreio() { return codigoRastreio; }
    public double getPeso() { return peso; }
    public String getStatus() { return status; }
}
