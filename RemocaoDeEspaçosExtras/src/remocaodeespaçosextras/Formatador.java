package remocaodeespaçosextras;

public class Formatador {

    private final String frase;

    public Formatador(String frase) {
        this.frase = frase;
    }

    public void removerEspacos() {
        String corrigida = frase.trim().replaceAll("\\s+", " ");
        System.out.println("Frase formatada: " + corrigida);
    }
}
