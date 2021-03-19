package fr.sg.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    @BeforeEach
    public void setUp(){
        fooBarQix =  new FooBarQix();
    }

    @Test
    public void shouldReturn1IfNumberIs1(){
        assertEquals("1", fooBarQix.transformNumbers(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        assertEquals("2", fooBarQix.transformNumbers(2));
    }

    @Test
    public void shouldReturnFooIfNumberIs3(){
        assertEquals("Foo", fooBarQix.transformNumbers(3));
    }

    @Test
    public void shouldReturnFooIfNumberIs6(){
        assertEquals("Foo", fooBarQix.transformNumbers(6));
    }
}
