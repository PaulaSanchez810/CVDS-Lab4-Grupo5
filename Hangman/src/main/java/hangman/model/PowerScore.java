package hangman.model;

import hangman.exception.InvalidValueExeption;

public class PowerScore implements hangman.model.dictionary.GameScore {
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws InvalidValueExeption {
        int score = 0;
        for (int i = 0; i < correctCount; i++) {
            score += Math.pow(5, i);
        }
        score -= incorrectCount * 8;
        return Math.max(Math.min(score, 500), 0);
    }
}
