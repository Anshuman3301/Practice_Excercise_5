
package com.stackroute.pe5;
//a program to implement set interface which sorts the given randomly ordered names in
//ascending order. Convert the sorted set in to an array list
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class NameSort{
    public static ArrayList<String> setSorter(String s)
    {
        String[] arr=s.split(" ");//split to get the words of the string.//
        Set<String> treeSet= new TreeSet<>();//initialize a treeset to keep the names in sorted way.//
        for (String a:arr)
        {
            treeSet.add(a);//add the strings to the tree.//
        }
        return new ArrayList<>(treeSet);//return the sorted array.//
    }
}