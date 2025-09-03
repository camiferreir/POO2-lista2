package contagemvogaisconsoantes;

import java.util.Scanner;

public class ContagemVogaisConsoantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        AnalisePalavra a = new AnalisePalavra(sc.nextLine());
        a.contarVogaisConsoantes();
        sc.close();
    }
}
