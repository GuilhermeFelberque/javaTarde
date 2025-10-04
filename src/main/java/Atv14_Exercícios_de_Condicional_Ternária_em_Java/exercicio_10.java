package Atv14_Exercícios_de_Condicional_Ternária_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(numero % 3 == 0 ? "Divisível " : "Não é divisilvel");
        sc.close();
    }
}
