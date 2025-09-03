
package verificacaodepalindromo;

public class palindromo {
      private final String texto;

    public palindromo(String texto) {
        this.texto = texto;
    }

    public void verificar() {
        String invertida = new StringBuilder(texto).reverse().toString();
        if (texto.equalsIgnoreCase(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }
    }
}
