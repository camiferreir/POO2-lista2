
package contagemdeletrass;

import java.util.Scanner;


public class ContagemDeLetrass {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        Palavra p = new Palavra(sc.nextLine());
        p.contarLetras();
        sc.close();
    }
    
}
