public class InverteString{
    public static void main(String[] args){
        String frase = "Target Sistemas";

        System.out.println(frase + " = " + inverteString(frase));
    }

    public static String inverteString(String frase){
        char[] charArray = frase.toCharArray();
        int len = frase.length() - 1;

        for(int i = 0; i < frase.length() / 2; i++){
            charArray[i] = frase.charAt(len - i);
            charArray[len - i] =  frase.charAt(i);
        }
        return String.valueOf(charArray);
    }
}
