package hangman.model;

public class OriginalScore implements hangman.model.dictionary.GameScore {

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        private final int initScore = 100;
        private int actualScore = 100;
        private int finalScore = 0;
        private final int minimumScore = 0;

        /**
         @pre los argumentos >=
         @pos El score > 0
         @param /correctCount número las letras corresctas
         @param /incorrectCount número de letras incorrectas
         @return /puntaje dependiendo se la palabras fuero correctas o incorrectas
         @throws /TestException si los argumentos no cumplen los requerimientos
         */
        @Override
        public int calculateScore(int correctCount, int incorrectCount) throws TestEception {
            if (correctCount < 0)throw new TestException(TestEception.invalidCorrectCount);
            else if (incorrectCount < 0)throw new TestEception(TestEception.invalidInCorrectCount);

            finalScore = actualScore - (incorrectCount*10);

            if (finalScore < 0){return minimalScore;}
            else{return finalScore;}
        }

        /**
         * @return int puntaje inicial
         */
        @Override
        public int getPuntajeIncial(){
            return initScore;
        }
    }
}
