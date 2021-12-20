package aula2.ex2;

public class Main {

    public static  void main(String args[]){
        FiguraGeometrica arr [ ] = new FiguraGeometrica[5];
        arr[0] = new Circulo(8);
        arr[1] = new Circulo(4);
        arr[2] = new Circulo(7);
        arr[3] = new Retangulo(8,7);
        arr[4] = new Triangulo(7,3);

        System.out.println("A area media é "+ Util.areaMedia(arr));
    }
}
