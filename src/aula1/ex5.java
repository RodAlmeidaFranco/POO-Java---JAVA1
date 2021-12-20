package aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {

    public static  void  main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira aqui a quantidade de numeros naturais");
        int nNaturais= input.nextInt();

        System.out.println("Insira aqui o numero de digitos");
        int nDigitos = input.nextInt();

        System.out.println("Insira aqui o digito");
        int digito = input.nextInt();

        List lista = new ArrayList();


        for(int x =0; x<999999999; x++){

            int qtdDigitos = 0;
            int j=0;
            int length = String.valueOf(x).length();
            char[] array =  String.valueOf(x).toCharArray();


            while( j < length){
                int a=Character.getNumericValue(array[j]);
                if(  a == digito)
                    qtdDigitos ++;

                if(qtdDigitos >= nDigitos){
                    lista.add(x);
                }

                j++;
            }

            if (lista.size() > nNaturais)
                break;
        }

        for (Object x : lista ) {
            System.out.println(x);
        }
    }


}
