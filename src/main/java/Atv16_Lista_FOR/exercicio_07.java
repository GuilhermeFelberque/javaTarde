package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar o programa ");
        sc.nextLine();
        int conta = 0, resultado = 0;
        for (int i=1;i<=60;i++) {
            System.out.println(i+" soldagem tempo "+i+" minutos: ");
            i=rand.nextInt();
            conta=i+conta;
            resultado=conta/60;
            System.out.println("Média "+resultado+" minutos");
            sc.close();
        }
    }
}
