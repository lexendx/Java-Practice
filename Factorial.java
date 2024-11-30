import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        
        
        int fact = getFactorial(n);
        System.out.println(fact);
        
        
        sc.close();
    }
}
