package aula17;

import java.util.Scanner;

/**
 *
 * @author 16343359613
 */
public class Aula17 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int n;
       
        System.out.println("Digite um valor inteiro:");
        n = ler.nextInt();
        
        for(int i = 2; i < n; i++){
            System.out.println(i);
        }
    }
    
}
