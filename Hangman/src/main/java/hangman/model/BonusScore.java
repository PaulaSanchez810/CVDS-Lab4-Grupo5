package hangman.model;

public class BonusScore implements hangman.model.dictionary.GameScore {
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
