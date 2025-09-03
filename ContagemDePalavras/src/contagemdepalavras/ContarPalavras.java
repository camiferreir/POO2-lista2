
package contagemdepalavras;

public class ContarPalavras {
    private final String frase;

    public ContarPalavras(String frase) {
        this.frase = frase;
    }

    public void contar() {
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Quantidade de palavras: " + palavras.length);
    }
}


