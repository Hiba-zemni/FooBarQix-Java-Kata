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
        assertEquals("1", fooBarQix.transform(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        assertEquals("2", fooBarQix.transform(2));
    }

    @Test
    public void shouldReturnFooFooIfNumberIs3(){
        assertEquals("FooFoo", fooBarQix.transform(3));
    }

    @Test
    public void shouldReturnFooIfNumberIs6(){
        assertEquals("Foo", fooBarQix.transform(6));
    }

    @Test
    public void shouldReturnBarBarIfNumberIs5(){
        assertEquals("BarBar", fooBarQix.transform(5));
    }

    @Test
    public void shouldReturnBarIfNumberIs10(){
        assertEquals("Bar", fooBarQix.transform(10));
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
        for(int i =1; i<=3; i++)
            numbers.add(i);
        expectedNumbers = new String[]{"1", "2", "FooFoo"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12FooFoo4BarIfNumberIsFrom1To5(){
        numbers = new ArrayList<>();
        for(int i =1; i<=5; i++)
            numbers.add(i);
        expectedNumbers = new String[]{"1", "2", "FooFoo", "4", "BarBar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturn12FooFoo4BarFooQix8FooBarIfNumberIsFrom1To10(){
        numbers = new ArrayList<>();
        for(int i =1; i<=10; i++)
            numbers.add(i);
        expectedNumbers = new String[]{"1", "2", "FooFoo", "4", "BarBar", "Foo", "Qix", "8", "Foo", "Bar"};
        assertArrayEquals(expectedNumbers, fooBarQix.transformNumbers(numbers).toArray());
    }

    @Test
    public void shouldReturnQixIfNumberIs7(){
        assertEquals("Qix", fooBarQix.transform(7));
    }

    @Test
    public void shouldReturnFooBarIfNumberIs51(){
        assertEquals("FooBar", fooBarQix.transform(51));
    }

    @Test
    public void shouldReturnBarFooIfNumberIs53(){
        assertEquals("BarFoo", fooBarQix.transform(53));

    }

    @Test
    public void shouldReturnFooIfNumberIs13(){
        assertEquals("Foo", fooBarQix.transform(13));
    }

    @Test
    public void shouldReturnFooBarBarIfNumberIs15(){
        assertEquals("FooBarBar", fooBarQix.transform(15));
    }

    @Test
    public void shouldReturnFooBarBarIfNumberIs27(){
        assertEquals("FooQix", fooBarQix.transform(27));
    }
}
