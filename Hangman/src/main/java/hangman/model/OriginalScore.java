package hangman.model;

import com.sun.jdi.IntegerValue;
import hangman.exception.InvalidValueExeption;

public class OriginalScore implements hangman.model.dictionary.GameScore {

    @Override
    public int calculateScore(int correctCount, int incorrectCount)  throws InvalidValueExeption {
            return Math.max(100 - incorrectCount * 10, 0);
        }

    }
}

