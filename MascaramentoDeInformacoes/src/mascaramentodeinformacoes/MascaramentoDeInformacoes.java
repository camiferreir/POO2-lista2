
package mascaramentodeinformacoes;

import java.util.Scanner;

public class MascaramentoDeInformacoes {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        cartao c = new cartao(sc.nextLine());
        c.mascarar();
        sc.close();
    }
}