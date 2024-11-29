import java.util.Scanner;

class IsDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number");
        int a = sc.nextInt();
        
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(a + " is divisible");
        } else {
            System.out.println(a + " is not divisible");
        }
        
        sc.close();
    }
}
