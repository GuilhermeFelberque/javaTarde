package Atv14_Exercícios_de_Condicional_Ternária_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();
        double imposto = salario > 5000 ? salario * 0.2 : salario * 0.1;

        System.out.println("Imposto: " + imposto);
        sc.close();
    }
}
