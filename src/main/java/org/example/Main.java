package org.example;

public class Main {
    public static void main(String[] args) {
        Rational rational1 = new Rational(7, 2);
        Rational rational2 = new Rational(1, 4);
       // rational1.generateFractionalNumber(rational2, "+");
        System.out.print("the result of add is : ");
       rational1.add(rational2);
        System.out.print("the result of sub is : ");
      rational1.sub(rational2);
        System.out.print("the result of div is : ");
        rational1.div(rational2);
        System.out.print("the result of mul is : ");
      rational1.mul(rational2);
        System.out.println("first overriding");
        System.out.println(rational1);
        System.out.println("second overriding");
    //    rational1.toString(rational1,"+");
        System.out.println("toFloatingPoint:"+rational1.toFloatingPoint(rational2));
    }
}
