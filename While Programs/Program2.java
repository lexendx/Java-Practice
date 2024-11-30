public class Program2 {
    public static void main(String[] args) {
        int i = 1000;
        int count = 0;
        while(i <= 2000) {
            if(i % 7 == 0 && i % 10 == 7) {
                System.out.println(i);
                count++;
            }
            i++;  
        }
        System.out.println("Total no divisible in b/w 1000 to 2000="+count);  
    }
}
