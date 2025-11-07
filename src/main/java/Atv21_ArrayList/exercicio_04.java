package Atv21_ArrayList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = sc.nextLine();
        String[] palavras = texto.split("\\s+");
        ArrayList<String> listaPalavras = new ArrayList<>();
        for (String p : palavras) {
            listaPalavras.add(p);
        }
        System.out.println("Palavras com até 4 letras:");
        for (String palavra : listaPalavras) {
            if (palavra.length() <= 4) {
                System.out.println(palavra);
            }
        }
        sc.close();
    }
}

