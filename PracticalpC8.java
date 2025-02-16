public class PracticalpC8 {
    public static void main(String[] args) {
        int max = 5;

        // Print star pattern
        for (int i = 1; i <= max; i += 2)
            System.out.println(" ".repeat((max - i) / 2) + "*".repeat(i));
        for (int i = max - 2; i >= 1; i -= 2)
            System.out.println(" ".repeat((max - i) / 2) + "*".repeat(i));

        // Print plus pattern immediately after stars
        for (int i = 0; i < 4; i++) 
            System.out.println("  +");
    }
}
