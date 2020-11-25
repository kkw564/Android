package com.example.mockedstaticunittest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    private static MockedStatic<Calculator> mCalculator;

    @BeforeClass
    public static void beforeClass() {
        mCalculator = mockStatic(Calculator.class);
    }

    @AfterClass
    public static void afterClass() {
        mCalculator.close();
    }

    @Test
    public void execute_add() {
        int a = 1, b = 2;
        when(Calculator.add(anyInt(), anyInt())).thenReturn(a + b);

        int sum = Calculator.add(a, b);

        assertEquals(a + b, sum);
    }
}