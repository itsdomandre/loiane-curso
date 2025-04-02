package com.domandre;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o valor do raio do circulo");
        double raio = scanner.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.println("A área é: " + area);
    }
}
