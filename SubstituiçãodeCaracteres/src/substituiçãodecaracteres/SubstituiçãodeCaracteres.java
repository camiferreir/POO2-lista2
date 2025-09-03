package substituiçãodecaracteres;

import java.util.Scanner;

public class SubstituiçãodeCaracteres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Frase ex = new Frase ();
        System.out.println("Frase modificada: " + ex.substituirAporAsterisco(frase));

        sc.close();
    }
}