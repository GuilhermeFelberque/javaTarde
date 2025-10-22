package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horario do seu turno: ");
        int turnos = sc.nextInt();
        String resultado = max(turnos);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int turnos) {
        String acao;

        if (turnos < 12) {
            acao = "Manhã";
        } else if (turnos <= 18) {
            acao = "Tarde";
        } else {
            acao = "Noite";
        }
        return acao;
    }
}