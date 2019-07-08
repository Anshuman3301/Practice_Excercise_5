package com.stackroute.pe5;

import java.util.Map;

public class ModifyTheMap
{
    public Map<String,String> modifiedMap(Map<String,String> map)
    {
        map.put("val1",map.get("val2"));
        map.put("val1","");
        return map;
    }
}
