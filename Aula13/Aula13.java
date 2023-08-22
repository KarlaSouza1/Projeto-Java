
package Aula13;

import java.util.Scanner;

/**
 * Aula 13
 * Disciplina: Linguagem de Programação
 * Data: 22/08/2023
 * @author Karla Souza
 */
public class Aula13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um numero inteiro");
        numero = ler.nextInt();
        
        numero = numero % 2;
        
        if(numero != 0){
            System.out.println("O numero é impar");
        }else{
            System.out.println("O numero é par");    
    }
           
    }   
}
