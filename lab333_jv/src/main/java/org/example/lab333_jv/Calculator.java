package org.example.lab333_jv;

public class Calculator {

    public static String tabulateFunction(double a, double b, double h) {
        String result = "";
        for (double x = a; x <= b; x += h) {
            double y = Math.cbrt(x);
            result += "x = " + x + ", f(x) = " + y + "<br>";
        }
        return result;
    }
}