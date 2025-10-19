package Atv17_Lista_Do_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*A sigla AS/RS significa Sistemas de Armazenamento e Recuperação Automatizados É um sistema de
        automação
        logística utilizado em armazéns e centros de distribuição para armazenar, organizar e
        recuperar produtos de
        forma automática e eficiente, usando tecnologia controlada por computador. */
        int prateleiras, validas = 0;

        System.out.print("Informe o número total de prateleiras: ");
        prateleiras = sc.nextInt();
        validas = 0;
        do {
            prateleiras++;
            System.out.println("Prateleira " + prateleiras + " validada.");
        } while (prateleiras < validas);
        System.out.println("Inventário concluído.");
        sc.close();
    }
}
