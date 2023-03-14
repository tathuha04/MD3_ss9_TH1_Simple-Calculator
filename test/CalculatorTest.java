import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import rikkei.academy.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing 0 + 0")
    public void testAdd0Add0(){
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1Add0(){
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0Add1(){
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 5 + 3")
    public void testAdd5Add3(){
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 0 - 0")
    public void testSub0and0(){
        int first = 0;
        int second = 0;
        int expected =8;
        // sai kết quả đầu ra
        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 1 - 0")
    public void testSub1and0(){
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 0 - 1")
    public void testSub0and1(){
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 5 - 3")
    public void testSub5and3(){
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }



}
