package br.com.fiapdelivery.model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        setCapacidadeCarga(capacidadeCarga);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            System.out.println("Erro: A capacidade não pode ser negativa!");
            this.capacidadeCarga = 0;
        } else {
            this.capacidadeCarga = capacidadeCarga;
        }
    }
}