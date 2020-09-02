package java.hangman.model;

public class GameScoreTest {

    /*
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                            Original Score
        Número     !! Clase de equivalencia !!!!!!!!!!!!!!!!!!!!!!!!Resultado

        ** 1    !! correctCount < 0 or incorrectCount < 0!!!!!!!!!!!Incorrecto
        ** 2     !! 0 <= incorrectCount <= 10 !!!!!!!!!!!!!!!!!!!!!!Correcto
        ** 3     !! 10 < incorrectCount !!!!!!!!!!!!!!!!!!!!!!!!!!!!Correcto
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/

       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                            Bonus Score
        Número     !! Clase de equivalencia !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Resultado

        ** 1    !!correctCount < 0 or incorrectCount < 0 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Incorrecto
        ** 2     !! (0 <= correctCount) and (0 <= incorrectCount <= 2(correctCount)) !!Correcto
        ** 3     !! incorrectCount > 2(correctCount) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Correcto
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/

        /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
                            Power Bonus Score
        Número     !! Clase de equivalencia !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Resultado

        ** 1    !!correctCount < 0 or incorrectCount < 0 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Incorrecto
        ** 2     !! 0 <= (Sum(5^$i-correctCount$) – 8*incorrectCount) <= 500 !!!!!!!!!!!!!!!!!Correcto
        ** 3     500 < (Sum(5^$i-correctCount$) – 8*incorrectCount) !!!!!!!!!!!!!!!!!!!!!!!!!!Correcto
        ** 4     Sum(5^$i-correctCount$) < 8*incorrectCount !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Correcto
       /+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/
    */
    @Test
    public void OriginalScoreTest1() {
        try  {

        }
        catch (numberOutRange n){

      }
    }
    public void OriginalScoreTest2() {
        try  {

        }
        catch (numberOutRange n){

        }

    }
    public void OriginalScoreTest3 (){
        try  {

        }
        catch (numberOutRange n){

        }

    }

   public void BonusScoreTest1(){
       try  {

       }
       catch (numberOutRange n){

       }

    }
    public void BonusScoreTest2(){
        try  {

        }
        catch (numberOutRange n){

        }

    }
    public void BonusScoreTest3(){
        try  {

        }
        catch (numberOutRange n){

        }

    }

    public void PowerBonusScoreTest1(){
        try  {

        }
        catch (numberOutRange n){

        }

    }
    public void PowerBonusScoreTest2(){
        try  {

        }
        catch (numberOutRange n){

        }

    }

    public void PowerBonusScoreTest3(){
        try  {

        }
        catch (numberOutRange n){

        }

    }

    public void PowerBonusScoreTest4(){
        try  {

        }
        catch (numberOutRange n){

        }

    }
}
