package Aula09;

import java.util.Scanner;

/**
 *Exercicio 09
 * 
 * Aula: 15/08/2023
 * @author Karla Souza
 */
public class aula09 {
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número inteiro:");
        int num = ler.nextInt();
        
        if(num > 0){
            System.out.println("Positivo");
        }else if(num < 0){
            System.out.println("Negativo");
        }else{
        System.out.println("Igual");
    }
    
}
}