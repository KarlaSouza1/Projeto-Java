package Aula04;

/**
 * Exercício 04
 * Aula:
 * Disciplina: Linguagem de Programação
 * Materia: Operadores Atribuição e Aritméticos
 * @author Karla Souza
 */
public class aula04 {
    public static void main(String[] args) {
        int a = 10;
        String b = "10";
        int c = 2;
        
        int resultadoA = a + c;
        int resultadoB = a - c;
        int resultadoC = a * c;
        int resultadoD = a / c;
        int resultadoE = a % c;
        int resultadoF = (int)a / c;
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("Soma: " + resultadoA);
        System.out.println("Subtração: " + resultadoB);
        System.out.println("Multiplicação: " + resultadoC);
        System.out.println("Divisão: " + resultadoD);
        System.out.println("Resto: " + resultadoE);
        System.out.println("Resultado como Inteiro: " + resultadoF);
        
        
    }
}
