package com.domandre;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número");
        int num2 = scanner.nextInt();
        int soma = num1+num2;
        System.out.println("A soma do primeiro e o segundo numero é: " + soma);
    }
}
