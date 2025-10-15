package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Aperte ENTER para começar o programa ");
        sc.nextLine();
        boolean defeito;
        double soma, porcentagem;
        soma = 0;
        for (int peca = 0; peca < 200; peca++) {
            System.out.println("A peça: " + peca + " foi verificada com sucesso");
            defeito = random.nextBoolean();
            if (defeito) {
                soma++;
            }
            porcentagem = (soma * 100) / 200;
            System.out.println("A quantidade de defeito é: " + porcentagem + "%");
        }
        sc.close();
    }
}