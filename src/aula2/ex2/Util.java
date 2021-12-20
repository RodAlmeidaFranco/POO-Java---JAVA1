package aula2.ex2;

public class Util {
    public static double areaMedia (FiguraGeometrica arr [ ]){
        double media = 0;

        for( FiguraGeometrica fig : arr )
            media = fig.area();

        return media/arr.length;
    }

}
