package Atv13_Exercícios_de_Lógica_de_Programação_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura (°C): ");
        int temperatura = sc.nextInt();
        String info = (temperatura > 80) ? "Máquina desligada" : "Máquina opernado normalmente";
        System.out.println("Valor da temperatura: " + info);
        sc.close();
    }
}
