package org.example.lab333_jv;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@RequestScoped
@Getter
@Setter
public class CalculatorBean implements Serializable {

    private double a;
    private double b;
    private double h;
    private String result;

    public String tabulate() {
        result = Calculator.tabulateFunction(a, b, h);

        return "result.xhtml";
    }
}