package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanFrequencyTest {
    BooleanFrequency ob;

    @Before
    public void setUp() throws Exception {
        ob=new BooleanFrequency();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void test1()
    {
        String[] query={"HE","HE","WE","WE","T"};
        String result=ob.booleanFrequency(query);
        assertEquals("{T=1, HE=2, WE=2}",result);
    }



}