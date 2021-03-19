package fr.sg.kata;

import java.util.List;

public class FooBarQix {

    public String transformNumbers(List<Integer> numbers){
        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            sb = sb.append(evaluateDivisibleRules(number));
        }
        return sb.toString();
    }

    private String evaluateDivisibleRules (Integer number) {
        StringBuilder sb = new StringBuilder();
        if (number  % 3 == 0) {
            sb = sb.append("Foo");
        }
        if(number % 5 == 0) {
            sb.append("Bar");
        }
        sb = sb.append(evaluateContainsRules(number));
        if (sb.length() == 0)
            return String.valueOf(number);
        return sb.toString();

    }

    private StringBuilder evaluateContainsRules(Integer number) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(number).toCharArray()) {
            if (c == '3'){
                sb = sb.append("Foo");
            }
            if (c == '5'){
                sb = sb.append("Bar");
            }
            if (c == '7'){
                sb = sb.append("Qix");
            }
        }
        return sb;
    }


}
