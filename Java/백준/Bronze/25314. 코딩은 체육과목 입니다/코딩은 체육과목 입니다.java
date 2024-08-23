import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr = "";
        
        for(int i = 0; i < n; i+=4) {
            arr += "long ";
        }
        System.out.println(arr+"int");
    }
}