import java.util.Scanner;
public class PowerFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b =  sc.nextInt();
        double result = Math.pow(a, b);
        System.out.println(result);
   sc.close(); }
}
