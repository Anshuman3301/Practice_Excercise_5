package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class BooleanFrequency
{
    public String booleanFrequency(String[] alphabets)
    {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String word: alphabets)
        {
            Integer count=map.get(word);

            if(count==null)
            {
                count=1;
            }
            else
            {
                count+=1;
            }
            map.put(word,count);
        }
        return map.toString();
    }
}
