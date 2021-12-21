package aula3.pratica2;

import aula3.pratica1.Vestuario;

public class Carro extends Veiculo {

    public Carro(double velocidade, double aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, 1000, 4);
    }
}
