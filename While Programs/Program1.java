

public class Program1 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i<=16){
            if(i%3==0){
                System.out.println(i);
                count++;
            }i++;
        }System.out.println(count);
    }
    
}
