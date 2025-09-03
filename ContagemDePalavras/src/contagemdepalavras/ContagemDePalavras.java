
package contagemdepalavras;

import java.util.Scanner;

public class ContagemDePalavras {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        ContarPalavras c = new ContarPalavras(sc.nextLine());
        c.contar();
        sc.close();
    }
}