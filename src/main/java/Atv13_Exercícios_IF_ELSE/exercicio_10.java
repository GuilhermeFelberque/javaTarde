package Atv13_Exercícios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de peso ? ");
        int peso = sc.nextInt();
        String info = (peso > 500) ? "Capacidade excedida" : "Peso dentro do limite";
        System.out.println("" + info);
        sc.close();
    }
}
