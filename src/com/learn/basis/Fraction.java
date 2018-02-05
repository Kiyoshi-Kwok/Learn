package com.learn.basis;

/**
 * Created by GIDEON on 2018/1/2.
 */
public class Fraction {
    int numerator;
    int denominator;
    public Fraction(int numerator, int denominator) {
        int factor = gcd(numerator,denominator);
        this.numerator = numerator / factor;
        this.denominator = denominator / factor;
    }

    int gcd(int a, int b) {// 循环实现
        int k = 0;
        do {
            k = a % b;// 得到余数
            a = b;// 根据辗转相除法,把被除数赋给除数
            b = k;// 余数赋给被除数
        } while (k != 0);
        return a;// 返回被除数
    }

    double toDouble() {
        double result = numerator / denominator;
        return result;
    }

    Fraction plus(Fraction fraction) {
        int r_numerator;
        int r_denominator;
        r_denominator = denominator * fraction.denominator;
        r_numerator = numerator * fraction.denominator + fraction.numerator * denominator;
        int factor = gcd(r_denominator,r_numerator);

        return new Fraction(r_numerator / factor,r_denominator / factor);
    }

    Fraction multiply(Fraction fraction) {
        int r_numerator;
        int r_denominator;
        r_denominator = denominator * fraction.denominator;
        r_numerator = numerator * fraction.numerator;
        int factor = gcd(r_denominator,r_numerator);
        return new Fraction(r_numerator / factor,r_denominator / factor);
    }

    void print() {
        if (numerator % denominator == 0) System.out.println(numerator / denominator);
        else System.out.print(numerator + "/" + denominator);
    }
}
