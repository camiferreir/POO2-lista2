package remocaodeespaçosextras;

import java.util.Scanner;

public class RemocaoDeEspaçosExtras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase com espaços extras: ");
        Formatador f = new Formatador(sc.nextLine());
        f.removerEspacos();
        sc.close();
    }
}
