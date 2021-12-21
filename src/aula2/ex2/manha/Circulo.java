package aula2.ex2.manha;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(this.raio, 2));
    }

    @Override
    public String toString() {
        return "Raio "+this.raio + "/n Area"+this.area();
    }
}
