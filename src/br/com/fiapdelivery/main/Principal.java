package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;
import br.com.fiapdelivery.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo meuCaminhao = new Caminhao("ABC1234", 1500.0, 3);
        Pacote meuPacote = new Pacote("BR999", 10.5);

        Rota entrega = new Rota(meuPacote, meuCaminhao);
        entrega.iniciarEntrega();

        Veiculo minhaMoto = new Moto("XYZ5678", 50.0, true);
        Rota entregaRapida = new Rota(meuPacote, minhaMoto);
        entregaRapida.iniciarEntrega();
    }
}
