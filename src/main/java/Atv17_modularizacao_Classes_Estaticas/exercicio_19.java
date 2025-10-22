package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o pH ? ");
        int pH = sc.nextInt();
        String resultado = max(pH);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int pH) {
        String acao;

        if (pH < 7) {
            acao = "Ácido";
        } else if (pH == 7) {
            acao = "Neutro";
        } else {
            acao = "Básico";
        }
        return acao;
    }
}