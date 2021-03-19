package fr.sg.kata;

public class FooBarQix {

    public String transformNumbers(int number){
        if (number % 3 == 0)
            return "Foo";
        if (number  == 5)
            return "Bar";
        return String.valueOf(number);

    }
}
