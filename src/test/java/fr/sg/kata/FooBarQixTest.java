package fr.sg.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    private List<Integer> numbers;
    @BeforeEach
    public void setUp(){
        fooBarQix =  new FooBarQix();
    }

    @Test
    public void shouldReturn1IfNumberIs1(){
        numbers = new ArrayList<>();
        numbers.add(1);
        assertEquals("1", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        numbers = new ArrayList<>();
        numbers.add(2);
        assertEquals("2", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnFooFooIfNumberIs3(){
        numbers = new ArrayList<>();
        numbers.add(3);
        assertEquals("FooFoo", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnFooIfNumberIs6(){
        numbers = new ArrayList<>();
        numbers.add(6);
        assertEquals("Foo", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnBarBarIfNumberIs5(){
        numbers = new ArrayList<>();
        numbers.add(5);
        assertEquals("BarBar", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnBarIfNumberIs10(){
        numbers = new ArrayList<>();
        numbers.add(10);
        assertEquals("Bar", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn12IfNumberIsFrom1To2(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        assertEquals("12", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn12FooFooIfNumberIsFrom1To3(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals("12FooFoo", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn12FooFoo4BarIfNumberIsFrom1To5(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        assertEquals("12FooFoo4BarBar", fooBarQix.transformNumbers(numbers));
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
        assertEquals("12FooFoo4BarBarFooQix8FooBar", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnQixIfNumberIs7(){
        numbers = new ArrayList<>();
        numbers.add(7);
        assertEquals("Qix", fooBarQix.transformNumbers(numbers));
    }
}
