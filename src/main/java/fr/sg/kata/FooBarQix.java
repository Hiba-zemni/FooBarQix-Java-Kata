package fr.sg.kata;

import java.util.List;

public class FooBarQix {

    public String transformNumbers(List<Integer> numbers){
        return evaluateDivisibleRules(numbers);

    }

    private String evaluateDivisibleRules (List<Integer> numbers) {
        String result ="";
        for (Integer number : numbers) {
            if (number % 3 == 0)
                result += "Foo";
           else if (number  % 5 == 0)
                result += "Bar";
            else result += String.valueOf(number);
        }
        return result;
    }
}
