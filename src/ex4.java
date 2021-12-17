import java.util.Scanner;

public class ex4 {

    public static  void  main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira aqui o numero");
        int numero = input.nextInt();
        for(int x = 2; x <= numero; x++){
            if (x % 2 != 0 && x % 3 != 0 && numero !=x) {
                System.out.println(x + " é primo");
            }
        }


    }
}
