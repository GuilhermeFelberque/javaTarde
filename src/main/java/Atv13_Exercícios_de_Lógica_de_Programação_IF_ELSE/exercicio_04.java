package Atv13_Exercícios_de_Lógica_de_Programação_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o peso da peça ? ");
        int peca = sc.nextInt();
        String info = (peca >= 5) ? "Peça pesada" : "Peça leve";
        System.out.println("" + info);
        sc.close();
    }
}
