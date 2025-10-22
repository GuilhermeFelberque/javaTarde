package Atv17_modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de energia (0 a 100): ");
        int energia = sc.nextInt();
        System.out.println(max(energia));

        sc.close();
    }

    public static String max(int energia) {
        String acao;

        if (energia < 30) {
            acao = "Modo econômico";
        } else if (energia <= 70) {
            acao = "Modo normal";
        } else {
            acao = "Modo turbo";
        }
        return acao;
    }
}
