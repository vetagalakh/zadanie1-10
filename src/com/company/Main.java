package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Double a = 5.0;                                            //задание 1
        {
            a = Double.valueOf(a);
           System.out.println(a);
        }
           String b = "80";                                        //задание 2
        {
            Integer i = Integer.valueOf(b);
            System.out.println(b);
        }
        {
            Integer c = Integer.parseInt("1100001001", 2); // Задание 3
            System.out.println(c);
        }
            String d = "1234567890";                               //задание 4
        {
            Integer i = Integer.parseInt(d);
            System.out.println(d);
        }

        System.out.println(Integer.MAX_VALUE);                    // задание 5
        System.out.println(Integer.MIN_VALUE);                    // задание 6
        System.out.println(Byte.MAX_VALUE);                       // задание 7
        System.out.println(Byte.MIN_VALUE);                       // задание 8

        String str = "Привет группа 132";
        System.out.println(str.toUpperCase(Locale.ROOT));         // задание 9
        System.out.println(str.length());                         // задание 10











    }
}
