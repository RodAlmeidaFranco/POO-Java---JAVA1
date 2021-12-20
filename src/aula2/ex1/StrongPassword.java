package aula2.ex1;

public class StrongPassword extends Password{

    private static final String strRegex = "[\\d]{6}";

    public StrongPassword() {
        super(strRegex);
    }
}
