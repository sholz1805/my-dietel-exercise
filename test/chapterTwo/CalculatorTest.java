package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {
    @Test
    void testCanAddTwoIntegers(){
        //given
         Calculator adder = new Calculator();
        //when
        int result = adder.add(5,6);
        assertEquals(11, result);

        }
     @Test
    void testCanMultiplyTwoIntegers(){
        //given
         Calculator multiplier = new Calculator();
         //when
         int result = multiplier.multiply(5,6);
         assertEquals(30, result);
     }
     @Test
    void testCanSubtractTwoIntegers(){
        //given
         Calculator subtract = new Calculator();
         //when
         int result = subtract.subtract(6,5);
         assertEquals(1, result);
     }

     @Test
    void testCanDivideTwoIntegers(){
        //given
         Calculator Divider = new Calculator();
         //WHEN
         int result = Divider.divide(10,5);
         assertEquals(2, result);

    }

    @Test
    void testCanReturnRemainder(){
        //given
        Calculator Modulo = new Calculator();
        //when
        int result = Modulo.remainder(7,3);
        assertEquals(1, result);
    }


    }








