package com.domandre;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double f = c * 1.8 + 32;
        System.out.println("A temperatura " + c + " em Farenhein é: " + f +"F");

    }
}
