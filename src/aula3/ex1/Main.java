package aula3.ex1;

import java.util.List;

public class Main {

    public static void main(String [] args){

        Pessoa p1 = new Pessoa("Nome UM","123456789");
        Pessoa p2 = new Pessoa("Nome Dois","12345678910");
        Pessoa p3 = new Pessoa("Nome TRES","1234567891011");
        Pessoa p4 = new Pessoa("Nome Quatro","123456789101112");
        Pessoa p5 = new Pessoa("Nome Cinco","12345678");

        Pessoa[] arr = {p1,p2,p3,p4,p5};
        SortUtil.sort(arr);

        for(Pessoa p: arr)
            System.out.println(p.getNome());



        Celular c1 = new Celular("40028922","Prop1");
        Celular c2 = new Celular("40028924","Prop2");
        Celular c3 = new Celular("40028923","Prop3");
        Celular c4 = new Celular("40028925","Prop4");
        Celular c5 = new Celular("40028921","Prop5");

        Celular[] arrCelular = {c1,c2,c3,c4,c5};
        SortUtil.sort(arrCelular);

        for(Celular c: arrCelular)
            System.out.println(c.getProprietario());
    }


}
