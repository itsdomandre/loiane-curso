package com.domandre;

import java.util.Scanner;

public class HHCamelCase {
    public static int countString(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as palavras para contabilização: ");
        String words = scanner.nextLine();
        int result = countString(words);
        System.out.println("Existem " + result + " Palavras");

    }


}
