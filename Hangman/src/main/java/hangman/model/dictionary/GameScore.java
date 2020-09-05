package hangman.model.dictionary;

import hangman.exception.InvalidValueExeption;


public interface GameScore {
    /**
     @pre los argumentos >=
     @pos El score > 0
     @param /correctCount número las letras corresctas
     @param /incorrectCount número de letras incorrectas
     @throws /TestException si los argumentos no cumplen los requerimientos
    */
    public int calculateScore(int correctCount, int incorrectCount) throws InvalidValueExeption;
}
