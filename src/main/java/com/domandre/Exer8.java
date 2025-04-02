package com.domandre;

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor/hora que você ganha: ");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite a Quantidade de hroas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        double salario = valorHora * horasTrabalhadas;
        System.out.println("Valor a receber: " +salario);
    }
}
