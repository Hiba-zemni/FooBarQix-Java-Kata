package fr.sg.kata;

public class FooBarQix {

    public String transformNumbers(int number1, int number2){
        if (number1 % 3 == 0)
            return "Foo";
        if (number1  % 5 == 0)
            return "Bar";
        return String.valueOf(number1);

    }
}
