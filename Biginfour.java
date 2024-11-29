import java.util.Scanner;
public class Biginfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
int a = sc.nextInt();
System.out.println("Enter the Second Number");
int b = sc.nextInt();
System.out.println("Enter the third number");
int c = sc.nextInt();
System.out.println("Enter the fourth number");
int d = sc.nextInt();
if(a>b && a>c && a>d ){
    System.out.println("Biggest number is " + a);
}
    else if(b>c && b>d){

System.out.println("biggest number is"+ b);

    }

else if(c>d){
System.out.println("biggest number is" + c);

}
else{
System.out.println("biggest number is" + d);

}
sc.close();

    }
}
