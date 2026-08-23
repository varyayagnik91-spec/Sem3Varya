import java.util.Scanner;

public class ExamHallSeatDuplicationChecker {

    // Checks the array of seat numbers for duplicates using nested loops only
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;
        boolean[] alreadyReported = new boolean[seatNumbers.length]; // avoid printing same duplicate twice

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) continue;

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    alreadyReported[j] = true; // mark so we don't reprint this value again
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] seatNumbers = new int[n];
        System.out.println("Enter " + n + " seat numbers:");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);

        sc.close();
    }
}