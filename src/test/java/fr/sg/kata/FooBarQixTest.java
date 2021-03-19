package fr.sg.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    @Test
    public void shouldReturn1IfNumberIs1(){
        assertEquals("1", new FooBarQix().transformNumbers());
    }
}
