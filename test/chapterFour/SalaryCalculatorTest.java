package chapterFour;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  SalaryCalculatorTest {
    SalaryCalculator salaryCalculator;
    @BeforeEach
    public void setUp(){
        salaryCalculator = new SalaryCalculator("James",41,10);
    }
    @DisplayName("Salary Calculator")
    @Test
    public void employeeCanBeCreated(){
       salaryCalculator.getName();
       assertEquals("James",salaryCalculator.getName());
       assertEquals(41,salaryCalculator.getHours());
       assertEquals(10,salaryCalculator.getHourlyRate());
    }

    @Test
    public void calculateHourlyRate(){
        salaryCalculator.calculateHourlyRate();
        assertEquals(415,salaryCalculator.calculateHourlyRate());
    }

    @Test
    public void calculateGrossPayAfterEveryFortyHours(){
        salaryCalculator.calculateHourlyRate();
        assertEquals(415,salaryCalculator.calculateHourlyRate());
    }





}