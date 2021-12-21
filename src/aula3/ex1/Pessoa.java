package aula3.ex1;

public class Pessoa implements Precedente{
    private String nome;
    private String CPF;

    @Override
    public int precedeA(Object o) {
        Pessoa p = (Pessoa) o;
        return this.CPF.compareTo(p.getCPF());
    }

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
