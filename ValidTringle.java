import java.util.Scanner;
public class ValidTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        int x = sc.nextInt();
        System.out.println("Enter Second side");
        int y =sc.nextInt();
        System.out.println("Enter the third side");
        int z = sc.nextInt();
        if(x+y>z && y+z>x && x+z>y){
System.out.println("valid tringle");


        }else{
System.out.println("Not a valid Tringle");

        }sc.close();
        
        

    }
}
