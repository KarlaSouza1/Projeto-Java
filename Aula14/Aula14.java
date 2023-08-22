
package Aula14;

import java.util.Scanner;

/**
 * Aula 14
 * Disciplina: Linguagem de Programação
 * Data: 22/08/2023
 * @author Karla Souza
 */
public class Aula14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        {
            System.out.println("MENU");
            System.out.println("1. Hamburguer-----R$30,00");
            System.out.println("2. Chesseburguer-----R$35,50");
            System.out.println("3. Fritas-----R$20,50");
            System.out.println("4. Regrigerante-----R$10,00");
            System.out.println("5. Milkshake-----R$30,00");
            System.out.println("Escolha uma opcao:");
            escolha = ler.nextInt();
            
            switch (escolha){
                case 1:
                    System.out.println("Voce escolheu: Hamburguer-----R$30,00");
                    break;
                case 2:
                    System.out.println("Voce escolheu: Chesseburguer-----R$35,50");
                    break;
                case 3:
                    System.out.println("Voce escolheu: Fritas-----R$20,50");
                    break;
                case 4:
                    System.out.println("Voce escolheu: Regrigerante-----R$10,00");
                    break;
                case 5:
                    System.out.println("Voce escolheu: Milkshake-----R$30,00");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
            
            
        }
        
    }
    
}
