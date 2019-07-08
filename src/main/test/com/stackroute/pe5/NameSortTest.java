package com.stackroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameSortTest {

    @Test
    public void setSorter() {
        String result=NameSort.setSorter("D C B A").toString();
        assertEquals("[A, B, C, D]",result);
    }
    @Test
    public void setSorter1() {
        String result=NameSort.setSorter("1 12 13 44").toString();
        assertEquals("[1, 12, 13, 44]",result);
    }
    @Test
    public void setSorter2() {
        String result=NameSort.setSorter("").toString();
        assertEquals("[]",result);
    }

}