package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância detectada pelo sensor: ");
        int sensor = sc.nextInt();
        String resultado = max(sensor);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int sensor) {
        String acao;

        if (sensor < 5) {
            acao = "Precisa freiar";
        } else if (sensor <= 15) {
            acao = "Reduzir velocidade";
        } else {
            acao = "Precisas acelerar";
        }
        return acao;
    }
}
