package examples.simple;

public class Cipher {
    public static void main(String[] args) {
        System.out.println(prevChar('y'));
    }
    private static char prevChar(char character){
        return (char) (((int) character) - 1);
    }
}

