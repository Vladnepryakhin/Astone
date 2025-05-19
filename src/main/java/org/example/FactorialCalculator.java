package main.java.org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FactorialCalculator {
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}