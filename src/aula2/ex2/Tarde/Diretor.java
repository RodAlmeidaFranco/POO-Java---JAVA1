package aula2.ex2.Tarde;

public class Diretor extends Funcionarios{

    double lucroTotal;

    public Diretor(boolean lucro, double lucroTotal ) {
        super(15000, 0.03, lucro);
        this.lucroTotal = lucroTotal;
    }

    @Override
    public void pagarSalario() {
        double salario = this.meta ? this.salarioBase + (lucroTotal * this.bonus) : this.salarioBase;
        System.out.println("Pagando "+salario);
    }
}
