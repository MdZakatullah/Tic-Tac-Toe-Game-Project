package vandana.assignment.com;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String input) {
        boolean[] alphabetCheck = new boolean[26]; // For a-z

        // Initialize all elements to false
        for (int i = 0; i < 26; i++) {
            alphabetCheck[i] = false;
        }

        // Iterate through the input and mark the corresponding alphabet letters as true
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabetCheck[ch - 'a'] = true;
            }
        }

        // Check if all alphabet letters are marked as true
        for (int i = 0; i < 26; i++) {
            if (!alphabetCheck[i]) {
                return false;
            }
        }

        return true;
    }
}

