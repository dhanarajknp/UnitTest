package com.kgisl.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.kgisl.test1.Arithmetic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest
{
    private int firstnumber;
    private int secondnumber;
    private int expectedresult;
    private Arithmetic arithmetic;

    public ArithmeticTest(int firstnumber,int secondnumber,int expectedresult)
    {
     super();
     this.firstnumber=firstnumber;
     this.secondnumber=secondnumber;
     this.expectedresult=expectedresult;
    }
    @Before
    public void intialize()
    {
        arithmetic=new Arithmetic();
    }


    @Parameterized.Parameters
    public static Collection input()
    {  
        return Arrays.asList(new Object[][]{{1,2,3},{11,22,33},{111,222,333}});
    }
    @Test
    public void testArithmeticTest()
    {
        System.out.println("sum of numbers :"+expectedresult);   
        assertEquals(expectedresult, arithmetic.sum(firstnumber,secondnumber));
    }
}