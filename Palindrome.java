import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome number");

        } else{
            System.out.println(num + " is not a palindrome number");
        }
    }
    //method for check the palindrome
    public static boolean isPalindrome(int num){
int orignalNumber = num; //store the orignal number for comprison
int reverseNumber = 0;//variable to store the reverse number
while(num !=0){


int digit = num % 10;//Etract the last digit
reverseNumber = reverseNumber * 10 + digit;//Build the reverse Number
num /= 10;// remove the last digit


}

// Compare the original number with the reversed number
return orignalNumber == reverseNumber;
    }
}
