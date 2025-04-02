package com.domandre;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num1 = scanner.nextInt();
        System.out.println("Digite um outro número inteiro");
        int num2 = scanner.nextInt();
        System.out.println("Digite um numero real");
        double num3 = scanner.nextDouble();

        // Produto do dobro do primeiro com metade do segundo
        int resultado1 = (num1*num1) * (num2/2);
        // triplo do primeiro numero + terceiro numero
        double resultado2 =  (num1*3)+ num3;
        // O terceiro numero elevado ao cubo
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado1 : " + resultado1);
        System.out.println("Resultado2 : " + resultado2);
        System.out.println("Resultado3 : " + resultado3);
    }
}
