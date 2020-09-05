package main.java.hangman.exception;

public class TestExeption extends Exception {
    public static final String INVALID_CORRECT_COUNT =" El valor de la variable correctCount es invalido";
    public static final String INVALID_ICORRECT_COUNT =" El valor de la variable incorrectCount es invalido";

    public TestExeption(String arg){super(arg);}

    }

}
