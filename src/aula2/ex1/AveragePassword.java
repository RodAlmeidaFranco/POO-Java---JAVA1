package aula2.ex1;

public class AveragePassword extends Password{

    private static final String strRegex = "[\\d]{9}";

    public AveragePassword() {
        super(strRegex);
    }
}
