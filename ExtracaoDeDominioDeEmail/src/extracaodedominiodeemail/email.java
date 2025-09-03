package extracaodedominiodeemail;

public class email {
     private final String endereco;

    public email(String endereco) {
        this.endereco = endereco;
    }

    public void extrairDominio() {
        int pos = endereco.indexOf("@");
        if (pos != -1) {
            System.out.println("Domínio: " + endereco.substring(pos + 1));
        } else {
            System.out.println("Email inválido.");
        }
    }
}
