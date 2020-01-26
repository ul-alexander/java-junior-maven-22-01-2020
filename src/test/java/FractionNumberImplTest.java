import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FractionNumberImplTest {

    @Test
    public void add1(){

        //FractionNumber1
        FractionNumberImpl number1 = new FractionNumberImpl();
        number1.setDivisor(2);
        number1.setDividend(3);
        //FractionNumber2
        FractionNumberImpl number2 = new FractionNumberImpl();
        number2.setDivisor(5);
        number2.setDividend(9);

        //Junit result wait
        FractionNumberImpl resultWait = new FractionNumberImpl();
        resultWait.setDividend(33);
        resultWait.setDivisor(10);

        //calulator
        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        FractionNumber resultFact =  calculator.add(number1,number2);
        //Junit test
        assertEquals(resultWait,resultFact);

    }
}
