package Atv17_modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ddigite a conddição da estrada (bloqueada, transito, normal): ");
        String transporte = sc.nextLine();
        String resultado = max(transporte);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(String transporte) {
        String acao;

        if (transporte.equalsIgnoreCase("bloqueada")) {
            acao = "Recalcular rota";
        } else if (transporte.equalsIgnoreCase("transito")) {
            acao = "Rota alternativa";
        } else {
            acao = "Seguir normal";
        }
        return acao;
    }
}