package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        System.out.println("--- Relatório de Entrega ---");
        System.out.println("Levando pacote: " + pacote.getCodigoRastreio());
        System.out.println("No veículo de placa: " + veiculo.getPlaca());
        System.out.println("Status atual: " + pacote.getStatus());
    }
}
