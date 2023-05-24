package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class RationalTest {
private Rational rational1;
private Rational rational2;


    @BeforeEach
    void setUp() {
       rational1=new Rational(7,2);
        rational2=new Rational(1,4);

    }

    @Test
    void add() {
        Rational rationalForAdd=rational1.add(rational2);
        assertEquals("+15/4",rationalForAdd.getStr());
    }

    @Test
    void sub() {
        Rational rationalForSubtract=rational1.sub(rational2);
        assertEquals("+13/4",rationalForSubtract.getStr());
    }

    @Test
    void mul() {
        assertEquals("+7/8",rational1.mul(rational2).toString());

    }

    @Test
    void div() {
        Rational rationalForDivide=rational1.div(rational2);
        assertEquals("+14/1",rationalForDivide.getStr());
    }

    @Test
    void toFloatingPoint() {
        assertEquals(0.25,rational1.toFloatingPoint(rational2));
    }
@Test
    void generateFractionalNumberTest(){
        Rational rational=new Rational(26,8);
        Rational rational4=rational.generateFractionalNumber(rational,"+");
        assertEquals("+13/4",rational4.getStr());
}
@Test
    void generateBmm(){
        assertEquals(2,rational1.generateBmm(26,8));
}
}