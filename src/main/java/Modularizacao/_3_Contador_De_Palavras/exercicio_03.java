package Modularizacao._3_Contador_De_Palavras;

public class exercicio_03 {
    private String frase; // atributo

    public int contarPalavras() {
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
