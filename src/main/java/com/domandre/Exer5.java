package com.domandre;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a metragem para converter em centimentos: ");
        double m = scanner.nextDouble();
        double mToCm = m*100;
        System.out.println("O total em centimentros é: " + mToCm + " centimentos.");
        System.out.printf("O total em centimetros = %.2f\n" , mToCm);
    }
}
