package com.stackroute.pe5;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CountWordsTest {

    @Test
    public void frequency1() {
        Map result=CountWords.frequency("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result.toString());
    }
    @Test
    public void frequency2() {
        Map result=CountWords.frequency("one1 one!_one@#");
        assertEquals("{one=2, one1=1}",result.toString());
    }
    @Test
    public void frequency3() {
        Map result=CountWords.frequency("22two@#!one!_one@#");
        assertEquals("{22two=1, one=2}",result.toString());
    }
}