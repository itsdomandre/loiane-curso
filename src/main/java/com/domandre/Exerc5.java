package com.domandre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc5 {
    public static int aboveAverage(List<Double> grades) {
        int count = 0;
        double media = 0;
        for (int i = 0; i < grades.size(); i++) {
            media += grades.get(i);
        }
        media = media / grades.size();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > media) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas?");
        int quantity = scanner.nextInt();
        System.out.println("Testando valores: ");
        List<Double> grades = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            grades.add(scanner.nextDouble());
        }

        int result = aboveAverage(grades);
        System.out.println("Quantidade de notas acima da media: " + result);

    }
}
