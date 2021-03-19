package fr.sg.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    @BeforeEach
    public void setUp(){
        fooBarQix =  new FooBarQix();
    }

    @Test
    public void shouldReturn1IfNumberIs1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        assertEquals("1", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        assertEquals("2", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnFooIfNumberIs3(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        assertEquals("Foo", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnFooIfNumberIs6(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        assertEquals("Foo", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnBarIfNumberIs5(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        assertEquals("Bar", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturnBarIfNumberIs10(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        assertEquals("Bar", fooBarQix.transformNumbers(numbers));
    }

    @Test
    public void shouldReturn12IfNumberIsFrom1To2(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        assertEquals("12", fooBarQix.transformNumbers(numbers));
    }
}
