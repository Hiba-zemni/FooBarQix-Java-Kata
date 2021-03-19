package fr.sg.kata;

import java.util.ArrayList;
import java.util.List;

public class FooBarQix {

    public List<String> transformNumbers(List<Integer> numbers){
        List<String> listNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            listNumbers.add(evaluateDivisibleRules(number));
        }
        return listNumbers;
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
        return getTransformedNumber(number, sb);

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

    private String getTransformedNumber(int number, StringBuilder sb) {
        if (sb.length() == 0)
            return String.valueOf(number);
        return sb.toString();
    }


}
