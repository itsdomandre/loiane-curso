package com.domandre;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a PRIMEIRA nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira a SEGUNDA nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Insira a TERCEIRA nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Insira a QUARTA nota: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1+nota2+nota3+nota4) / 4;
        System.out.println("A media é: " + media);
    }
}
