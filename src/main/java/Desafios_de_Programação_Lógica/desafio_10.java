package Desafios_de_Programação_Lógica;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class desafio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int tentativas = 0;
        int limiteInferior = 1;
        int limiteSuperior = 100;
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        int palpite = 0;
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;
            if (palpite < numeroSecreto) {
                System.out.println("É maior!");
                if (palpite >= limiteInferior) limiteInferior = palpite + 1;
            } else if (palpite > numeroSecreto) {
                System.out.println("É menor!");
                if (palpite <= limiteSuperior) limiteSuperior = palpite - 1;
            }
        }
        System.out.println("\n🎉 Parabéns! Você acertou o número: " + numeroSecreto);
        System.out.println("Número de tentativas: " + tentativas);
        int maxTentativasBinaria = (int) Math.ceil(Math.log(100) / Math.log(2));
        if (tentativas <= maxTentativasBinaria) {
            System.out.println("Você se aproximou da lógica de Busca Binária! 🟢");
        } else {
            System.out.println("Sua tentativa foi ineficiente. Tente usar a lógica de meio do intervalo. ");
        }
        sc.close();
    }
}


