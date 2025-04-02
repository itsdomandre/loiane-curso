package com.domandre;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double f = scanner.nextDouble();
        double c = (5* (f-32)/9);
        System.out.println("A temperatura " + f + " em Celsius é: " + c +"ªC");
    }
}
