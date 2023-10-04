package Controller;

import java.util.Scanner;

public class Validation {

    private final static Scanner in = new Scanner(System.in);
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }
}
