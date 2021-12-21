package aula2.ex2.Tarde;

public class Main {

    public static void main( String [] args){
        Funcionarios anl = new Analista(true);
        Funcionarios tec = new Tecnico(true);
        Funcionarios ger = new Gerente(true);
        Funcionarios dir = new Diretor(true, 500000);
        dir.pagarSalario();
        anl.pagarSalario();
        tec.pagarSalario();
        ger.pagarSalario();
    }


}
