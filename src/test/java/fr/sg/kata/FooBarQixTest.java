package fr.sg.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    private List<Integer> numbers;
    private String [] expectedNumbers;

    @BeforeEach
    public void setUp(){
        fooBarQix =  new FooBarQix();
    }

    @Test
    public void shouldReturn1IfNumberIs1(){
        numbers = new ArrayList<>();
        numbers.add(1);
        expectedNumbers = new String[]{"1"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        numbers = new ArrayList<>();
        numbers.add(2);
        expectedNumbers = new String[]{"2"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooFooIfNumberIs3(){
        numbers = new ArrayList<>();
        numbers.add(3);
        expectedNumbers = new String[]{"FooFoo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooIfNumberIs6(){
        numbers = new ArrayList<>();
        numbers.add(6);
        expectedNumbers = new String[]{"Foo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnBarBarIfNumberIs5(){
        numbers = new ArrayList<>();
        numbers.add(5);
        expectedNumbers = new String[]{"BarBar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnBarIfNumberIs10(){
        numbers = new ArrayList<>();
        numbers.add(10);
        expectedNumbers = new String[]{"Bar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12IfNumberIsFrom1To2(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        expectedNumbers = new String[]{"1", "2"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12FooFooIfNumberIsFrom1To3(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        expectedNumbers = new String[]{"1", "2", "FooFoo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12FooFoo4BarIfNumberIsFrom1To5(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        expectedNumbers = new String[]{"1", "2", "FooFoo", "4", "BarBar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12FooFoo4BarFooQix8FooBarIfNumberIsFrom1To10(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        expectedNumbers = new String[]{"1", "2", "FooFoo", "4", "BarBar", "Foo", "Qix", "8", "Foo", "Bar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnQixIfNumberIs7(){
        numbers = new ArrayList<>();
        numbers.add(7);
        expectedNumbers = new String[]{"Qix"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooBarIfNumberIs51(){
        numbers = new ArrayList<>();
        numbers.add(51);
        expectedNumbers = new String[]{"FooBar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnBarFooIfNumberIs53(){
        numbers = new ArrayList<>();
        numbers.add(53);
        expectedNumbers = new String[]{"BarFoo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooIfNumberIs13(){
        numbers = new ArrayList<>();
        numbers.add(13);
        expectedNumbers = new String[]{"Foo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooBarBarIfNumberIs15(){
        numbers = new ArrayList<>();
        numbers.add(15);
        expectedNumbers = new String[]{"FooBarBar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnFooBarBarIfNumberIs27(){
        numbers = new ArrayList<>();
        numbers.add(27);
        expectedNumbers = new String[]{"FooQix"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }
}
