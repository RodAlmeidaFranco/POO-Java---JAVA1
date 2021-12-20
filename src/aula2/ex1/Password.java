package aula2.ex1;

import com.sun.jdi.request.InvalidRequestStateException;

public class Password {

    private String password;
    private String regex;

    public Password(String regex){
        this.regex = regex;
    }
    public void setValue( String pwd){
        if(!pwd.matches(regex))
            throw new InvalidRequestStateException("Senha Invalida");
    }
}
