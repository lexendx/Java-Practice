import java.util.Scanner;
public class Biginthree  {
    public static void main(String[] args) {
        
    
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter The First Number");
    int x = sc.nextInt();
    System.out.println("Enter the Second Number");
    int y = sc.nextInt();
    System.out.println("Enter the third Number");
    int z = sc.nextInt();
    if(x>y&&x>z){
        System.out.println("big is" + x);
    }
    else if(y>z){
        System.out.println("big is" + y);
    }
    else{
        System.out.println("big is" + z);
    }
    sc.close();
}

}
