package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CataTest {


    @Test
    public void aGradeCanBeCalculatedTest() {
        Cata gradeSomething = new Cata();
        char result = gradeSomething.calculateGradeFor(98);
        assertEquals('A', result);
    }


    @Test
        public void bGradeCanBeCalculatedTest(){
        Cata gradesSomething = new Cata();
        char result = gradesSomething.calculateGradeFor(89);
        assertEquals('B', result);

        }

    @Test
    public void cGradeCanBeCalculatedTest() {
        Cata gradesSomething = new Cata();
        char myResult = gradesSomething.calculateGradeFor(79);
        assertEquals('C', myResult);
    }
    @Test
    public void dGradeCanBeCalculatedTest() {
        Cata gradesSomething = new Cata();
        char aResult = gradesSomething.calculateGradeFor(65);
        assertEquals('D', aResult);
    }
    @Test
    public void fGradeCanBeCalculatedTest() {
        Cata gradesSomething = new Cata();
        char aResult = gradesSomething.calculateGradeFor(59);
        assertEquals('F', aResult);
    }

    @Test
    public void priceOneCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 4;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 2000,amount);
    }
    @Test
    public void priceTwoCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 7;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1800,amount);
    }
    @Test
    public void priceThreeCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 15;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1600,amount);
    }
    @Test
    public void priceFourCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 35;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1500,amount);
    }
    @Test
    public void priceFiveCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 50;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1300,amount);
    }
    @Test
    public void priceSixCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 105;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1200,amount);
    }
    @Test
    public void priceSevenCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 327;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1100,amount);
    }
    @Test
    public void priceEightCanBeCalculated(){
        Cata priceCbt = new Cata();
        int quantity = 650;
        int amount = priceCbt.setPriceFor(quantity);
        assertEquals(quantity * 1000,amount);
    }







}

