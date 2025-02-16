public class Practicalp8 {
    static void printPattern(int n, int max) {
        System.out.println("*".repeat(n));
        if (n < max) {
            printPattern(n + 1, max);
            System.out.println("*".repeat(n)); 
        }
    }

    public static void main(String[] args) {
        printPattern(1, 4); 
    }
}
