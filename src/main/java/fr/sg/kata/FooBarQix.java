package fr.sg.kata;

import java.util.List;

public class FooBarQix {

    public String transformNumbers(List<Integer> numbers){
        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            sb = sb.append(evaluateDivisibleRules(number));
            sb = evaluateContainsRules(sb, number);

        }
        return sb.toString();
    }

    private StringBuilder evaluateContainsRules(StringBuilder sb, Integer number) {
        for (char c : String.valueOf(number).toCharArray()) {
            if (c == '3'){
                sb = sb.append("Foo");
            }
        }
        return sb;
    }

    private StringBuilder evaluateDivisibleRules (Integer number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0)
            sb = sb.append("Foo");
        if (number  % 5 == 0)
            sb = sb.append("Bar");
        if (sb.length() == 0)
            return sb.append(number.toString());
        return sb;

    }
}
