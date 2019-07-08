package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceWords
{
    public ArrayList<String> replaceWords(ArrayList<String> fruits,int index, String newWord)
    {
        if(fruits.size()<index)
        {
            return null;
        }

        fruits.set(index, newWord);
        return fruits;
    }
}
