package com.domandre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc3 {
    public static int countEvenNumbers(List<Integer> numbers) {
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos da lista: ");
        int quantity = scanner.nextInt();
        System.out.println("Digite os números desejados: (um por linha) ");
        List<Integer> numbersList = new ArrayList<>();
        for (int num = 0; num < quantity; num++) {
            numbersList.add(scanner.nextInt());
        }
        int result = countEvenNumbers(numbersList);
        System.out.println("A lista digitada: " + numbersList);
        System.out.println("Quantidade de números pares: " + result);
        scanner.close();
    }
}
