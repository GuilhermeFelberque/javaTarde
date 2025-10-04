package Atv14_Exercícios_de_Condicional_Ternária_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();

        System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
