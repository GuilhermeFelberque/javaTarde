package Atv17_modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do data center: ");
        int temperatura = sc.nextInt();
        String resultado = max(temperatura);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int temperatura) {
        String acao;

        if (temperatura > 80) {
            acao = "Desligar serviodres";
        } else if (temperatura >= 60) {
            acao = "Resfriamneto extra";
        } else {
            acao = "Normal";
        }
        return acao;
    }
}