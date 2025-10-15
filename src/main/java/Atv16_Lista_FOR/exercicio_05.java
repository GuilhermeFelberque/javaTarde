package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        double soma = 0;
        for (int hora = 1; hora <= 24; hora++) {
            System.out.println("A hora atual é " + hora);
            for (int i = 1; i < 10; i++) {
                int energia = rand.nextInt(60);
                soma += energia;
                System.out.println("Máquina " + i + " consumiu " + energia + " kWh");
                System.out.println("O consumo total de energia foi de: " + soma + "kWh");
                sc.close();
            }
        }
    }
}
