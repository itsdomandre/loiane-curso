package com.domandre;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo (em MB)");
        double tamArquivo = scanner.nextDouble();
        System.out.println("Digite a velocidade de internet (em Mbps)");
        double velocidadeInternet = scanner.nextDouble();
        double tempoDownload = tamArquivo / velocidadeInternet;
        System.out.println("Tempo aproximado de download: " + tempoDownload + " minutos ");
    }
}