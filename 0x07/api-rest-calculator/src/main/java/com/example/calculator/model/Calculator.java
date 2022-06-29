package com.example.calculator.model;

import java.time.LocalDate;
import java.time.Period;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        if(number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        if(number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 - number2;
    }

    public Double divide (Double number1, Double number2)  {
        if(number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        if(number2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
        return number1/number2;
    }

    public Integer factorial(Integer factorial) {
        if(factorial == null) {
            throw new NullPointerException("Número é obrigatório.");
        }

        Integer factorialResult = 1;

        for(int i = 1; i <= factorial; i++) {
            factorialResult = factorialResult * i;
        }

        return factorialResult;
    }

    public Integer integerToBinary(Integer integer) {
        String binary = "";

        while (integer > 0) {
            binary = binary + integer % 2;
            integer = integer/2;
        }

        StringBuilder sb = new StringBuilder(binary);

        return Integer.valueOf(sb.reverse().toString());
    }

    public String integerToHexadecimal(Integer integer) {
        return Integer.toHexString(integer).toUpperCase();
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);

        return period.getDays();
    }
}
