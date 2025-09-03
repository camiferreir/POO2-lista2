
package extracaodedominiodeemail;

import java.util.Scanner;

public class ExtracaoDeDominioDeEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu email: ");
        email e = new email(sc.nextLine());
        e.extrairDominio();
        sc.close();
    }
}