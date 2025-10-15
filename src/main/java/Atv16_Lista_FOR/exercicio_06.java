package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar o programa ");
        sc.nextLine();
        int calculo;
        double soma = 0, media;
        for (int i = 0; i < 50; i++) {
            calculo = rand.nextInt(30);
            soma += calculo;
            media = soma / 2;
            System.out.println("O cosumo de material é: " + soma);
            System.out.println("Estoque médio é: " + media);
            sc.close();
        }
    }
}
