/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

package Questoes;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (verifyIsFibonacci(numero)) {
            System.out.println(numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence a sequenquêcia de Fibonacci.");
        }
    }

    private static boolean verifyIsFibonacci(int num) {
        if (num == 0 || num == 1) return true;

        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}
