package aula3.pratica2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Corrida {
    private double distancia;
    private double premioDol;
    private String nome;
    private int qtdVeiculos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premioDol, String nome, int qtdVeiculos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioDol = premioDol;
        this.nome = nome;
        this.qtdVeiculos = qtdVeiculos;
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(double velocidade, double aceleracao,double anguloDeGiro, String placa){
        Carro relampagoMarquinhos = new Carro(velocidade,aceleracao,anguloDeGiro,placa);
        this.listaVeiculos.add(relampagoMarquinhos);
    };

    public void registrarMoto(double velocidade, double aceleracao,double anguloDeGiro, String placa){
        Moto moto = new Moto(velocidade,aceleracao,anguloDeGiro,placa);
        this.listaVeiculos.add(moto);
    };

    public void removerVeiculoPorPlaca( String placa){
        Predicate<Veiculo> condicao = veiculo -> veiculo.getPlaca().equals(placa);
        this.listaVeiculos.removeIf(condicao);

    };

    public void removerVeiculo(Veiculo veiculo ){
        this.listaVeiculos.remove(veiculo);
    }

    public void definirVenedor(List<Veiculo> corredores ){
        Veiculo vencedor = null;
        double maiorMarca = 0;
        double marca = 0;

        for(Veiculo v : corredores){
            marca = v.getVelocidade()
                    * v.getAceleracao()/(v.getAnguloGiro()
                    *(v.getPeso() - v.getRodas() * 100));

            if (maiorMarca < marca){
                maiorMarca = marca;
                vencedor = v;
            }

        }

        System.out.println("O vencedor é carro da placa - "+vencedor.getPlaca());
        System.out.println("Com a marca de - "+maiorMarca);
    }

    public void ajudarCarro(Carro carro){
        this.socorristaCarro.socorrer(carro);
    }

    public void ajudarMoto(Moto moto){
        this.socorristaMoto.socorrer(moto);
    }



    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDol() {
        return premioDol;
    }

    public void setPremioDol(double premioDol) {
        this.premioDol = premioDol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }

    public void setQtdVeiculos(int qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
