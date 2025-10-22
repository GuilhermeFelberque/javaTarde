package Atv17_modularizacao_Classes_Estaticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de usário (operador, supervisor, engenheiro ): ");
        String usuario = sc.nextLine();
        System.out.println(max(usuario));

        sc.close();
    }

    public static String max(String usuario) {
        String acao;

        if (usuario.equalsIgnoreCase("operador")) {
            acao = "Acesso restrito";
        } else if (usuario.equalsIgnoreCase("supervisor")) {
            acao = "Acesso parcial";
        } else if (usuario.equalsIgnoreCase("engenheiro")) {
            acao = "Acesso total";
        } else {
            acao = "Usuário inválido";
        }
        return acao;
    }
}
