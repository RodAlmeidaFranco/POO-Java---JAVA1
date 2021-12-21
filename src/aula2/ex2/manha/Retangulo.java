package aula2.ex2.manha;

public class Retangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Base "+this.base +"/n altura "+this.altura+"/n Area"+this.area();
    }
}
