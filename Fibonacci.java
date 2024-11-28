import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter The Value of n");
        n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        
        // Print the first term
        System.out.print(a + " ");
        
        // Loop to print the remaining Fibonacci terms
        for (int i = 2; i <= n; i++) {
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(a + " ");
        }
        
        sc.close();
    }
}
