package fr.sg.kata;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    private static final List<Integer> numbers;
    static{
        numbers = new ArrayList<>();
        for (int i=1; i<=100; i++) {
            numbers.add(i);
        }
    }


    public static void main (String[] args){
        FooBarQix fooBarQix = new FooBarQix();
        List<String> listNumbers = fooBarQix.transformNumbers(numbers);
        for (String number: listNumbers) {
            System.out.println(number);
        }
    }

}
