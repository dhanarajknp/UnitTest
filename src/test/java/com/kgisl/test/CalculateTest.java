package com.kgisl.test;

import static org.junit.Assert.assertEquals;

import com.kgisl.test1.Calculate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest 
{

    Calculate calculate=new Calculate();
    int sum=calculate.sum(2, 5);
    int testsum=7;
    
    @BeforeClass
    public static void setup() {
        System.out.println("BeforeClass") ;
    }
 
    @Before
    public void setupThis() {
        System.out.println("Before") ;
    }

    @Test 
    public void testsum()
    { 
        System.out.println("@Test sum(): " + sum + " = " + testsum);
        assertEquals(sum, testsum);

    }

    @After
    public void tearThis() {
        System.out.println("After") ;
    }
 
    @AfterClass
    public static void tear() {
        System.out.println("AfterClass") ;
    }

}