package Questoes;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int contador = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }

        scanner.close();
    }
}
