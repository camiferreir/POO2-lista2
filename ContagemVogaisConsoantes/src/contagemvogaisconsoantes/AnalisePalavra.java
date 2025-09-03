package contagemvogaisconsoantes;

public class AnalisePalavra {

    private final String texto;

    public AnalisePalavra(String texto) {
        this.texto = texto.toLowerCase();
    }

    public void contarVogaisConsoantes() {
        int vogais = 0, consoantes = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        System.out.println("Vogais: " + vogais + ", Consoantes: " + consoantes);
    }
}
