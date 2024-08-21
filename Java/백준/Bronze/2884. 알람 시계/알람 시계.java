import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        
        if (M - 45 < 0) {
            H--;
            M=60+(M-45);
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
            
        } else{
            System.out.println(H + " " + (M - 45));
        }
    }
}