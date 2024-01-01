package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printHelloWorld(3);
        printHelloWorld(5);
        printHelloWorld(7);
    }
    public static void printHelloWorld(int count) {
        String message = "Hello, world!";
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
