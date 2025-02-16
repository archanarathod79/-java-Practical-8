public class PracticalpA8 {
    public static void main(String[] args) {
        // Printing the increasing stars
        for (int i = 1; i <= 3; i++) {
            System.out.println(" ".repeat(3 - i) + "*".repeat(i));
        }

        // Printing ++++
        System.out.println("++++");

        // Printing decreasing slashes
        for (int i = 3; i >= 2; i--) {
            System.out.println(" ".repeat(4 - i) + "/".repeat(i));
        }
    }
}

