package aula3.pratica1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vestuario vst1 = new Vestuario("Nike","Moletom");
        Vestuario vst2 = new Vestuario("Adidas","Calça");
        Vestuario vst3 = new Vestuario("Puma","Tenis");

        List<Vestuario> lst = new ArrayList<>();

        lst.add(vst1);
        lst.add(vst2);
        lst.add(vst3);

        Vestuario vt1 = new Vestuario("New ERA","Camisa");
        Vestuario vt2 = new Vestuario("TOMMY","Camisa");
        Vestuario vt3 = new Vestuario("Lacoste","polo");

        List<Vestuario> lst2 = new ArrayList<>();

        lst2.add(vt1);
        lst2.add(vt2);
        lst2.add(vt3);

        GuardaRoupa grp = new GuardaRoupa();

        int indice = grp.guardaVestuarios(lst);
        grp.guardaVestuarios(lst2);

        grp.mostrarVestuarios();
        grp.devolverVestuarios(indice);
    }
}
