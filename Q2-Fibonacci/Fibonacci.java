/*
    Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
    valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que
    desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
    se o número informado pertence ou não a sequência.

    IMPORTANTE:
    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
    definido no código;
 */

public class Fibonacci{
    public static void main(String[] args){
        int value = 55;

        if(isInFibonacci(n)){
            System.out.println(value + " pertence a sequencia de Fibonacci.");
        }else{
            System.out.println(value + " não pertence a sequencia de Fibonacci");

        }
    }

    private static boolean isInFibonacci(int value){
        int a = 1, b = 0, tmp;

        while( b <= value){
            if (b == value) return true;



            tmp = a;
            a += b;
            b = tmp;
        }
        return false;
    }
}