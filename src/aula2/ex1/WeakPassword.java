package aula2.ex1;

public class WeakPassword extends Password{

    private static final String strRegex = "[\\d]{3}";

    public WeakPassword() {
        super(strRegex);
    }
}
