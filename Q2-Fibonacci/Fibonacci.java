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