package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a intensidade elétrica: ");
        int verificacao = sc.nextInt();
        String resultado = max(verificacao);

        sc.close();
    }

    public static String max(int verificacao) {
        String acao;

        if (verificacao < 100) {
            acao = "Fraca";
        } else if (verificacao <= 200) {
            acao = "Média";
        } else {
            acao = "Forte";
        }
        return acao;
    }
}