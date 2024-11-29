import java.util.Scanner;
public class ValidTringleByAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Angle");
        int x = sc.nextInt();
        System.out.println("Enter the Second Angle");
        int y = sc.nextInt();
        System.out.println("Enter the Third Angle");
        int z = sc.nextInt();
        if((x>0 && y>0 && z>0)&&(x+y+z ==180)){
System.out.println("Valid Tringle");


        }else{
            System.out.println("Not valid Tringle");
        }
        sc.close();
    }
}
