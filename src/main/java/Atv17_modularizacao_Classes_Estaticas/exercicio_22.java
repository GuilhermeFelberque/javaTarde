package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ddigite o indice de partículas: ");
        int particulas = sc.nextInt();
        String resultado = max(particulas);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int particulas) {
        Scanner sc = new Scanner(System.in);
        String acao;

        if (particulas < 50) {
            acao="Moderado";
        } else if (particulas <= 100) {
            acao="Ruim";
        } else {
            acao="Crítico";
        }
        return acao;
    }
}
