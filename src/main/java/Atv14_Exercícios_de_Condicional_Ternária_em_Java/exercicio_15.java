package Atv14_Exercícios_de_Condicional_Ternária_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade :");
        int idade = sc.nextInt();

        System.out.println(idade >= 16 ? "Pode votar" : "Não pode votar");
        sc.close();
    }
}
