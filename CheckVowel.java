import java.util.*;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any value");
        char ch = sc.next().charAt(0);
if(ch == 'a' || ch == 'A'|| ch == 'e'|| ch=='E'|| ch=='I'|| ch=='i'|| ch=='O'|| ch=='o'|| ch=='U'|| ch=='u'){
System.out.println(ch + " is vowel");
}
else if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
{
    System.out.println(ch + " is consonent");
 }
 else{
    System.out.println(ch + " not an Alphabet");
 } sc.close();
    }
}
