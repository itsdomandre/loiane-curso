package com.domandre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc1 {

    public static int countAboveThreshold(List<Integer> listNumber, int threshold) {
        int count = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) > threshold) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos:");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Digite o valor limite (threshold):");
        int threshold = scanner.nextInt();

        int result = countAboveThreshold(numbers, threshold);
        System.out.println("Quantidade acima do limite: " + result);

        scanner.close();
    }
}






