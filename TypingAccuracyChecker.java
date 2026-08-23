public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int matchedChars = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedChars++;
            } else {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }

        double accuracy = ((double) matchedChars / original.length()) * 100;

        System.out.println("Matched: " + matchedChars + "/" + original.length());
        System.out.printf("Accuracy: %.2f%%", accuracy);

        if (firstMismatch != -1) {
            System.out.println(" | First Mismatch at position "
                    + (firstMismatch + 1) + " ('"
                    + original.charAt(firstMismatch) + "' vs '"
                    + typed.charAt(firstMismatch) + "')");
        } else {
            System.out.println(" | No Mismatches");
        }
    }

    public static void main(String[] args) {
        String original = "hello world";
        String typed = "hello wortl";

        checkTypingAccuracy(original, typed);
    }
}