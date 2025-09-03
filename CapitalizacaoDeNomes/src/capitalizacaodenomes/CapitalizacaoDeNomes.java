package capitalizacaodenomes;

import java.util.Scanner;

public class CapitalizacaoDeNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        Nome n = new Nome(sc.nextLine());
        n.capitalizar();
        sc.close();
    }
}
