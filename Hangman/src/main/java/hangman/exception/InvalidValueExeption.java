package hangman.exception;

public class InvalidValueExeption extends Throwable {
        public static final String INVALID_CORRECT_COUNT =" El valor de la variable correctCount es invalido";
        public static final String INVALID_ICORRECT_COUNT =" El valor de la variable incorrectCount es invalido";

        public InvalidValueExeption (String arg){super(arg);}

    }

}
}
