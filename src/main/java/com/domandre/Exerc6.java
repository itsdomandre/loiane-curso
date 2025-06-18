package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int countMatches(List<Integer> a, List<Integer> b) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(i)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade dos elementos da Lista A: ");
        int quantityA = scanner.nextInt();
        System.out.println("Digite a quantidade dos elementos da Lista B: ");
        int quantityB = scanner.nextInt();
        System.out.println("Digite os elementos da Lista A");
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < quantityA; i++) {
            aList.add(scanner.nextInt());
        }
        System.out.println("Digite os elementos da Lista B");
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < quantityB; i++) {
            bList.add(scanner.nextInt());
        }

        int result = countMatches(aList, bList);
        System.out.println("Quantidade de números iguais entre as listas: " + result);
    }
