package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class RationalTest {
Rational rational1;
Rational rational2;
Rational rational3;

    @BeforeEach
    void setUp() {
       rational1=new Rational(7,2);
        rational2=new Rational(1,4);
        rational3=new Rational(13,4);
    }

    @Test
    void add() {
        assertEquals("+15/4",rational1.add(rational2));
    }

    @Test
    void sub() {
        assertEquals("+13/4",rational1.sub(rational2).toString());
    }

    @Test
    void mul() {
        assertEquals("+7/8",rational1.mul(rational2).toString());

    }

    @Test
    void div() {
        assertEquals("+14/1",rational1.div(rational2));
    }

    @Test
    void toFloatingPoint() {
        assertEquals(0.25,rational1.toFloatingPoint(rational2));
    }

}