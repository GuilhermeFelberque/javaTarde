package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade restante de material: ");
        int material = sc.nextInt();
        String resultado = max(material);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int material) {
        String acao;

        if (material < 20) {
            acao = "Trocar material";
        } else {
            acao = "Continuar impressão";
        }
        return acao;
    }
}
