package java;


import hangman.exception.InvalidValueExeption;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.dictionary.GameScore;
import main.java.hangman.exception.TestExeption;
import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class GameScoreTest {
    /*
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                            Original Score
        |---------------------------------------------------------------|
        | Número |        Clase de equivalencia             |Resultado  |
        |---------------------------------------------------------------|
        |   1    |correctCount < 0                          |Incorrecto |
        |   2    |incorrectCount < 0                        |Incorrecto |
        |   3    | 0 <= incorrectCount <= 10                |Correcto   |
        |   4    |10 < incorrectCount                       |Correcto   |
        |---------------------------------------------------------------|
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                                          Bonus Score
        |----------------------------------------------------------------------------------------|
        |  Número |    Clase de equivalencia                                         |Resultado  |
        |----------------------------------------------------------------------------------------|
        |   1     | correctCount < 0                                                 |Incorrectp |
        |   2     | incorrectCount < 0                                               |Incorrecto |
        |   3     | incorrectConunt < 0                                              |Incorrecto |
        |   4     | (0 >= correctCount)                                              |Correcto   |
        |   5     | (0 >= incorrectCount <= 4)                                       |Correcto   |
        |   6     | incorrectCount >= 5                                              |Correcto   |
        |----------------------------------------------------------------------------------------|
        /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                                      Power Bonus Score
        |-------------------------------------------------------------------------------------------|
        |Número  |         Clase de equivalencia                                       |Resultado   |
        |-------------------------------------------------------------------------------------------|
        |   1    |correctCount < 0                                                     |Incorrecto  |
        |   2    | incorrectCount < 0                                                  |Incorrecto  |
        |   3    |0 <= (Sum(5^$i-correctCount$) – 8*incorrectCount) <= 500             |Correcto    |
        |   4    |500 < (Sum(5^$i-correctCount$) – 8*incorrectCount)                   |Correcto    |
        |   5    |Sum(5^$i-correctCount$) < 8*incorrectCount                           |Correcto    |
        |---------------------------------------------------------------------------------------------------|
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
    */
    @Test
    public void originalScoreTest() throws InvalidValueExeption {
        GameScore originalScore = new OriginalScore();
        int case1 = originalScore.calculateScore(-1, 0);
        int case2 = originalScore.calculateScore(20, -1);
        int case3= originalScore.calculateScore(0, 9);
        int case4 = originalScore.calculateScore(1, 6);

        assertTrue( case1>0);
        assertTrue(case2 >0);
        assertEquals(0 <= case3 && case3<=10,9 );
        assertTrue(case4<10);
    }

    @Test
    public void bonusScoreTest() throws InvalidValueExeption {
        GameScore bonusScore = new BonusScore();
        int case1 = bonusScore.calculateScore(-1, 4);
        int case2 = bonusScore.calculateScore(0, -6);
        int case3 = bonusScore.calculateScore(-1, 5);
        int case4= bonusScore.calculateScore(0, 6);
        int case5=bonusScore.calculateScore(0, 3);
        int case6=bonusScore.calculateScore(0, 19);

        assertTrue(case1>0);
        assertTrue(case2>0);
        assertTrue(case3>0);
        assertTrue(0 <= case4);
        assertTrue(0<= case5 && case5 <=4);
        assertTrue(case6 >=5);
    }

    @Test
    public void powerScoreTest() throws InvalidValueExeption {
        GameScore powerScore = new PowerScore();
        int case1 = powerScore.calculateScore(-1, 0);
        int case2 = powerScore.calculateScore(9, -1);
        int case3 = powerScore.calculateScore(5, 200);
        int case4 = powerScore.calculateScore(100, 200);
        int case5 = powerScore.calculateScore(0, 300);

        assertTrue(case1>=0);
        assertTrue(case2>=0);
        assertTrue(case1>= 0 && case2 <= 500);
        assertEquals(case2, 500);
        assertEquals(0, case3);
    }


}
