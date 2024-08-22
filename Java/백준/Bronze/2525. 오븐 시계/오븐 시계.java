import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        int C = scan.nextInt();
        
        M += C;
        H += M/60;
        
        H = H%24;
        
        M = M%60;
        
        System.out.println(H +" " + M);
        
        
        
        
    }
}