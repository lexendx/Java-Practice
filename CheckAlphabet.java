import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter any value");
char ch = sc.next().charAt(0);
if((ch>97&& ch<=122)|| (ch>=65&& ch<=90)){
System.out.println(ch + "is an Alphabet");

}else{
    System.out.println(ch + "is not an Alphabet");
}sc.close();
    }
}
