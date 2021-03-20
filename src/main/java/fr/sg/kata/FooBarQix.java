package fr.sg.kata;

import java.util.List;
import java.util.stream.Collectors;

public class FooBarQix {

    public List<String> transformNumbers(List<Integer> numbers){
       return numbers.stream().map(number ->transform(number)).collect(Collectors.toList());
    }

     String transform(int number){
        StringBuilder sb = new StringBuilder();
        evaluateDivisibleRules(sb, number);
        evaluateContainsRules(sb, number);
        return getTransformedNumber(number, sb);
    }

    private String evaluateDivisibleRules (StringBuilder sb, Integer number) {
        if (number  % 3 == 0)
            sb = sb.append("Foo");
        if(number % 5 == 0)
            sb.append("Bar");
        return getTransformedNumber(number, sb);
    }

    private StringBuilder evaluateContainsRules(StringBuilder sb, Integer number) {
        for (char c : String.valueOf(number).toCharArray()) {
            if (c == '3')
               sb.append("Foo");
            if (c == '5')
                sb.append("Bar");
            if (c == '7')
                sb.append("Qix");
        }
        return sb;
    }

    private String getTransformedNumber(int number, StringBuilder sb) {
        if (sb.length() == 0)
            return String.valueOf(number);
        return sb.toString();
    }


}
