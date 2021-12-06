package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionerTest {
    public static AirConditioner myAc;
    @BeforeEach
    public void startingPoint(){
       myAc = new AirConditioner();
    }

    @Test
    public void checkThatAcIsOff(){
        //given that i have an ac

        //check that ac is off
        myAc.turnOff();
        boolean checkAcIsOn = myAc.isOn();
        assertFalse(checkAcIsOn);
    }

    @Test
    public void checkThatAcCanBeTurnedOn(){
        //given that we have an ac and it is off
        myAc.turnOff();
        boolean checkAcIsOn = myAc.isOn();
        assertFalse(checkAcIsOn);

        //when i turn it on
        myAc.turnOn();
        //check that ac is on
        assertTrue(myAc.isOn());
    }

    @Test
    public void checkThatAcTemperatureCanBeIncreased(){
        //given that i have an ac and it is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        //when i increase the temperature by 1
        myAc.increaseTemperature();
        //check that temperature increases by 1
//        int currentTemperature = myAc.getTemperature();
        assertEquals(17, myAc.getTemperature());
    }

    @Test
    public void checkThatAcTemperatureCanBeDecreased(){
        //given that i have an ac and it is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        myAc.increaseTemperature();
        //when i decrease the temperature by 1
        myAc.decreaseTemperature();
        //check that it decreases by 1
        assertEquals(16, myAc.getTemperature());
    }

    @Test
    public void checkThatAcTemperatureCannotIncreaseBeyond30(){
        //given that i have an ac and it is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        //when i increase the temperature beyond 30
        for (int temp=0; temp<15; temp++){
            myAc.increaseTemperature();
        }
        assertEquals(30  , myAc.getTemperature());
        //check that temperature doesnt go beyond 30
    }

    @Test
    public void checkThatAcTemperatureCannotDecreaseBelow16(){
        //given that i have an ac and it is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        //when i decrease the temperature below 16
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
    }
}