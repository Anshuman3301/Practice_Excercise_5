package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceWordsTest {

    ReplaceWords ob;
    ArrayList<String> fruits=new ArrayList<String>(Arrays.asList("banana","apple","orange","guava"));
    ArrayList<String> res;
    @Before
    public void setUp() throws Exception {
        ob=new ReplaceWords();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void testone()
    {
        res=ob.replaceWords(fruits,0, "LL");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("LL","apple","orange","guava"));
        assertEquals(dummy, res);
    }

    @Test
    public void testtwo()
    {
        testone();
        res=ob.replaceWords(res,1, "GG");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("LL","GG","orange","guava"));
        assertEquals(dummy, res);
    }

    @Test
    public void testthree()
    {
        testtwo();
        res=ob.replaceWords(res,2, "HH");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("LL","GG","HH","guava"));
        assertEquals(dummy, res);
    }

}