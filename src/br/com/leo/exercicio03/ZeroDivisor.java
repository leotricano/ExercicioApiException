package br.com.leo.exercicio03;

import java.util.Scanner;

//Crie um programa simples que solicita dois números ao usuário
// e realiza a divisão do primeiro pelo segundo. Utilize o bloco
// try/catch para tratar a exceção que pode ocorrer caso o usuário
// informe 0 como divisor.

public class ZeroDivisor {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Coloque o numerador");
            int numerador = ler.nextInt();
            System.out.println("Divisor: ");
            int divisor = ler.nextInt();

            int resposta;
            resposta = numerador / divisor;
            System.out.println(resposta);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
