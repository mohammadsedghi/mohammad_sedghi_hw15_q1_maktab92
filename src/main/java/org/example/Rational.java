package org.example;

public class Rational {
    //constructor
    public Rational(int numerator, int Denominator) {
        setNumerator(numerator);
        setDenominator(Denominator);
    }

    //variable
    private int numerator, Denominator;
    private String str;

    //Setter and Getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public String getStr() {
        return str;
    }


    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator should not be zero");
            System.exit(0);
        }
        this.Denominator = denominator;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // this method simplify method
    public Rational generateFractionalNumber(Rational rational, String sign) {
        int anotherNumerator = rational.getNumerator() / generateBmm(rational.getNumerator(), rational.getDenominator());
        int anotherDenominator = rational.getDenominator() / generateBmm(rational.getNumerator(), rational.getDenominator());
        rational.setStr(sign + anotherNumerator + "/" + anotherDenominator);
        printResult(rational);
        return rational;

    }

    public int generateBmm(int a, int b) {
        int i;
        if (a > b)
            i = a;
        else
            i = b;

        while ((a % i != 0) || (b % i != 0)) {
            i--;
        }
        return i;
    }

    //this method result is sum of two fraction
    public Rational add(Rational rational) {
        Rational rational3 = new Rational(getNumerator(), getDenominator());
        int sorat = getNumerator();
        int makhraj = getDenominator();
        int temp = 0;
        if (makhraj == rational.getDenominator()) sorat += rational.getNumerator();
        else {
            temp = makhraj * rational.getDenominator();
            sorat = (rational.getDenominator() * sorat) + (rational.getNumerator() * makhraj);
        }
        rational3.setNumerator(sorat);
        rational3.setDenominator(temp);
        return generateFractionalNumber(rational3, "+");
    }

    //this method result is mines of two fraction
    public Rational sub(Rational rational) {
        Rational rational3 = new Rational(getNumerator(), getDenominator());
        int sorat = getNumerator();
        int makhraj = getDenominator();
        int temp = 0;
        if (makhraj == rational.getDenominator()) sorat -= rational.getNumerator();
        else if (makhraj < rational.getDenominator()) {
            temp = makhraj * rational.getDenominator();
            sorat = (rational.getDenominator() * sorat) - (rational.getNumerator() * makhraj);

        } else {
            temp = makhraj * rational.getDenominator();
            sorat = (rational.getNumerator() * makhraj) - (rational.getDenominator() * sorat);
            rational3.setNumerator(sorat);
            rational3.setDenominator(temp);
            return generateFractionalNumber(rational3, "-");
        }
        rational3.setNumerator(sorat);
        rational3.setDenominator(temp);
        return generateFractionalNumber(rational3, "+");
    }

    //this method result is multiple of two fraction
    public Rational mul(Rational rational) {
        Rational rational3 = new Rational(getNumerator(), getDenominator());
        int sorat = getNumerator();
        int makhraj = getDenominator();
        sorat *= rational.getNumerator();
        makhraj *= rational.getDenominator();
        rational3.setNumerator(sorat);
        rational3.setDenominator(makhraj);
        return generateFractionalNumber(rational3, "+");
    }

    //this method result is division of two fraction
    public Rational div(Rational rational) {
        Rational rational3 = new Rational(getNumerator(), getDenominator());
        int sorat = getNumerator();
        int makhraj = getDenominator();
        sorat *= rational.getDenominator();
        makhraj *= rational.getNumerator();
        rational3.setNumerator(sorat);
        rational3.setDenominator(makhraj);
        return generateFractionalNumber(rational3, "+");
    }

    //this method result is to float of  fraction
    public double toFloatingPoint(Rational num) {
        int a = num.getNumerator();
        int b = num.getDenominator();

        return (double) a / b;
    }

    // overriding to String method
    @Override
    public String toString() {
        int anotherNumerator = getNumerator();
        int anotherDenominator = getDenominator();
        int remaining, outside;
        String str = "";
        if (anotherNumerator % anotherDenominator != 0) {
            remaining = anotherNumerator % anotherDenominator;
            anotherNumerator -= remaining;
            outside = anotherNumerator / anotherDenominator;
            if (outside == 0) {
                str = "+" + remaining + "/" + anotherDenominator;
                return str;
            }
                str = outside + "+" + remaining + "/" + anotherDenominator;

        }
        return str;
    }

    //another way to overriding to string method
//    public String toString(Rational rational, String sign) {
//        rational.setStr(sign + rational.getNumerator() + "/" + rational.getDenominator());
//        printResult(rational);
//        return getStr();
//    }

    public void printResult(Rational rational) {
        System.out.println(rational.getStr());
    }


}
