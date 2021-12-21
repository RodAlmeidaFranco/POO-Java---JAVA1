package aula2.ex2.Tarde;

public class Funcionarios  {

    double salarioBase;
    double bonus;
    boolean meta;

    public Funcionarios(double salarioBase, double bonus, boolean meta) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
        this.meta = meta;
    }

    public void pagarSalario() {
        double salario = this.meta ? this.salarioBase* (1+this.bonus) : this.salarioBase;
        System.out.println("Pagando "+salario);
    }
}
