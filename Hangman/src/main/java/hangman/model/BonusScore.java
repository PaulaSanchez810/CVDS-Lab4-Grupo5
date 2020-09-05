package hangman.model;

import hangman.exception.InvalidValueExeption;

public class BonusScore implements hangman.model.dictionary.GameScore {
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws InvalidValueExeption {
            return Math.max(correctCount * 10 - incorrectCount * 5, 0);
    }
}
