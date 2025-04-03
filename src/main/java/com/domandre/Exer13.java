package com.domandre;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor/hora do seu trabalho:  ");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês:  ");
        int horasTrabalhadas = scanner.nextInt();
        double salarioBruto = valorHora*horasTrabalhadas;
        double inss = salarioBruto * 0.11;
        double ir = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double totalDescontos = inss + ir + sindicato;
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Valor pago ao INSS: "+ inss);
        System.out.println("Valor pago ao IR: "+ ir);
        System.out.println("Valor pago ao Sindicato: "+ sindicato);
        System.out.println("Salário Líquido: " + (salarioBruto - totalDescontos));
    }
}
