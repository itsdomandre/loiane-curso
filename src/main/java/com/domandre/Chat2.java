package com.domandre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat2 {
    public static double differenceBetweenClasses(List<Double> classA, List<Double> classB) {
        double sumClassA = 0.0;
        double sumClassB = 0.0;

        for (int i = 0; i < classA.size(); i++) {
            sumClassA += classA.get(i);
        }
        System.out.println("Soma Turma A: " + sumClassA);
        for (int i = 0; i < classB.size(); i++) {
            sumClassB += classB.get(i);
        }
        System.out.println("Soma Turma B: " + sumClassB);

        return Math.abs(sumClassA - sumClassB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da turma A: ");
        int quantityA = scanner.nextInt();
        List<Double> classA = new ArrayList<>();
        System.out.println("Digite as notas respectivas dos alunos: ");
        for (double i = 0; i < quantityA; i++) {
            classA.add(scanner.nextDouble());

        }

        System.out.println("As notas foram: " + classA);
        System.out.println("Digite a quantidade de alunos da turma B: ");
        int quantityB = scanner.nextInt();
        List<Double> classB = new ArrayList<>();
        System.out.println("Digite as notas respectivas dos alunos: ");

        for (double j = 0; j < quantityB; j++) {
            classB.add(scanner.nextDouble());
        }
        System.out.println("As notas foram: " + classB);
        double total = differenceBetweenClasses(classA, classB);
        System.out.println(" A diferença entre as turmas A e B é: " + total);
        scanner.close();
    }


}
