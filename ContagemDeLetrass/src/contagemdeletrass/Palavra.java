package contagemdeletrass;

public class Palavra {

    private final String texto;

    public Palavra(String texto) {
        this.texto = texto;
    }

    public void contarLetras() {
        System.out.println("A palavra possui " + texto.length() + " letras.");
    }
}
