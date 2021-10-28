package it.unical.prova_2021_10_28;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        MyListUtil test = new MyListUtil();
        List<Integer> list = test.sort(Arrays.asList(47, 48, 32, 4, 1, 289), 0);
        System.out.println(list);
        list = test.sort(Arrays.asList(47, 48, 32, 4, 1, 289), 1);
        System.out.println(list);
    }
}
