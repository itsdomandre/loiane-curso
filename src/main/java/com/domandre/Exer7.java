package com.domandre;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = Math.pow(lado,2);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado é: " + (area*2));
    }
}
