package Atv13_Exercícios_de_Lógica_de_Programação_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de material disponivel ? ");
        int quantidade = sc.nextInt();
        String info = (quantidade > 0) ? "Impressão realizada" : "Sem material disponivel";
        System.out.println("" + info);
        sc.close();
    }
}
