package aula2.ex2;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }

    @Override
    public String toString() {
        return "Base "+this.base +"/n altura "+this.altura+"/n Area"+this.area();
    }
}
