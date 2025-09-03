package capitalizacaodenomes;

public class Nome {

    private final String nomeCompleto;

    public Nome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void capitalizar() {
        String[] partes = nomeCompleto.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                resultado.append(Character.toUpperCase(parte.charAt(0)))
                        .append(parte.substring(1))
                        .append(" ");
            }
        }
        System.out.println("Nome formatado: " + resultado.toString().trim());
    }
}
