package Aula08;
/**
 * Exercicio 08
 * 
 * Aula: 18/05/2023
 * Materia: Operadores Relacionais, Lógicos e Estruturas
 * 
 * > maior que
 * < menor que
 * >= maior ou igual a
 * <= menor ou igual a
 * != diferente
 * 
 * e &&
 * ou ||
 * negado !
 * 
 * if = se
 * else = então
 * 
 * @author Karla Souza
 */
public class aula08 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        
        System.out.println(a != b);
        System.out.println(a > b && a < b);
        
        if(a > b){
            System.out.println("Maior");                           
        }else if(a < b) {
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }
}
