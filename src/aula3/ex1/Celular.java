package aula3.ex1;

public class Celular implements Precedente{
    String numero;
    String Proprietario;

    @Override
    public int precedeA(Object o) {
        Celular c = (Celular) o;
        return this.numero.compareTo(c.numero);
    }

    public Celular(String numero, String proprietario) {
        this.numero = numero;
        Proprietario = proprietario;
    }

    public String getNumero() {
        return numero;
    }

    public String getProprietario() {
        return Proprietario;
    }
}
