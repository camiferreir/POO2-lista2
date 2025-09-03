
package verificacaodepalindromo;

import java.util.Scanner;

public class VerificacaoDePalindromo {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palindromo p = new palindromo(sc.nextLine());
        p.verificar();
        sc.close();
    }
}
    
