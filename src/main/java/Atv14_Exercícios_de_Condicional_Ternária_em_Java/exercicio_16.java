package Atv14_Exercícios_de_Condicional_Ternária_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int nummero = sc.nextInt();

        System.out.println(nummero % 5 == 0 ? "Múltiplo de 5" : "Não é múltiplo de 5");
        sc.close();
    }
}
