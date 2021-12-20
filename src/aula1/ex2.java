package aula1;

import java.util.Scanner;

public class ex2 {

    public static  void  main( String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira aqui o numero");
        int numero = input.nextInt();

        System.out.println("Insira aqui o multiplo");
        int multiplo = input.nextInt();

        for (int x = 0; x <= numero; x++) {
            if (x % multiplo == 0 && x > 0)
                System.out.println(x);
        }

    }
}
