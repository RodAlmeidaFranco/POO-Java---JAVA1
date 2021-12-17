import java.util.Scanner;

public class ex3 {

    public static  void  main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira aqui o numero");
        int numero = input.nextInt();
        boolean isPrimo = true;
        for(int x = 2; x <= 10; x++){
            if (numero % x == 0 && numero !=x) {
                isPrimo = false;
                break;
            }
        }
        System.out.println(numero + " é primo ? "+isPrimo);

    }
}
