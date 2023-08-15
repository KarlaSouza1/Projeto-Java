package Aula07;

import java.util.Scanner;

/**
 *Exercicio 07
 * Linguagem de Programação
 * Aula: 15/08/2023
 * @author Karla Souza
 */
public class aula07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
                String nome = ler.next();
                
        System.out.println("Qual a primeira nota?");
        float nota1 = ler.nextFloat();
        
        System.out.println("Qual a segunda nota?");
        float nota2 = ler.nextFloat();
        
        System.out.println("Qual a terceira nota?");
        float nota3 = ler.nextFloat();
        
        System.out.println("Qual a quarta nota?");
        float nota4 = ler.nextFloat();
        
        float soma, media = 0;
         soma = nota1 + nota2 + nota3 + nota4;
         media = soma / 4;
        
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
    
    
}
