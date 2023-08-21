package aula12;

import java.util.Scanner;

/**
 * Aula 12
 * Disciplina: Linguagem de programação
 * Data: 21/08/2023
 * @author Karla Souza
 */
public class Aula12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            System.out.println("Informe sua idade:");
            int idade = ler.nextInt();
            
            if(idade < 18){
                System.out.println("Você é menor de idade!");
            }else if (idade >= 18){
                System.out.println("Você é maior de idade!");
            }
            
            
            
    }
    
}

