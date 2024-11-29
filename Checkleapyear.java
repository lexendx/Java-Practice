import java.util.Scanner;

public class Checkleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Year");
        int year = sc.nextInt();

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is divisible by 100, check if it is also divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                // If the year is divisible by 4 but not by 100
                System.out.println(year + " is a leap year");
            }
        } else {
            // If the year is not divisible by 4
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
