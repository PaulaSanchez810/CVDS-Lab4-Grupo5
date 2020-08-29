package hangman.model.dictionary;

public interface GameScore {
    public int calculateScore(int correctCount, int incorrectCount);
}
