package Atv12C;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        double peso = (72.7 * altura) - 58;
        System.out.println("O peso ideal é: " + peso);
        sc.close();
    }
}
