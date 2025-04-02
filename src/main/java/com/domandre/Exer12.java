package com.domandre;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();
        double pesoIdeal = (72.7*altura) - 58;
        System.out.println("O peso ideal para a altura "+ altura+  " é: "+ pesoIdeal + "kg");
    }
}
