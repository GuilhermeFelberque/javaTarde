package Atv13_Exercícios_de_Lógica_de_Programação_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Qual a quantidade de peças montadas ?");
        int peca = sc.nextInt();
        String info = (peca == 0) ? "Erro: Verificar robô." : "Montagem em andamento.";
        System.out.println("" + info);
        sc.close();
    }
}
