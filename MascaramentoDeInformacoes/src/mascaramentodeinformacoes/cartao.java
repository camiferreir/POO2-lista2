
package mascaramentodeinformacoes;

public class cartao {
     private final String numero;

    public cartao(String numero) {
        this.numero = numero;
    }

    public void mascarar() {
        if (numero.length() > 4) {
            String ultimos4 = numero.substring(numero.length() - 4);
            String mascarado = null;
      
            System.out.println("Cartão mascarado: " + mascarado);
        } else {
            System.out.println("Número inválido.");
        }
    }
}

