package com.domandre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc4 {
    public static int maxDifference(List<Integer> numbers) {
        int minNumber = numbers.get(0);
        int maxNumber = numbers.get(0);


        for (int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            if (value > maxNumber) {
                maxNumber = value;
            }
            if (value < minNumber){
                minNumber = value;
            }
        }
        return Math.abs(maxNumber - minNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que deseja verificar a diferença entre o MÁXIMO e MÍNIMO: ");
        int quantity = scanner.nextInt();
        System.out.println("Digite os números desejados (one per row): ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i< quantity;i++){
            numbers.add(scanner.nextInt());
        }
        int result = maxDifference(numbers);
        System.out.println("A diferença entre os números é: " + result);
    }

}
