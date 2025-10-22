package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a produção de peças por hora: ");
        int peca = sc.nextInt();
        String resultado = max(peca);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int peca) {
        String acao = "";

        if (peca < 50) {
            acao = "Baixo desempenho";
        } else if (peca <= 100) {
            acao = "Regular";
        } else {
            acao = "Ótimo";
        }
        return acao;
    }
}