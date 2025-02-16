
public class practicalN8 {
    static void printPattern(int n) {
        System.out.println(n);
        if (n < 7) {
            printPattern(n + 2);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printPattern(1);
    }
}
