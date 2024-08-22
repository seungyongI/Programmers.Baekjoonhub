import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();
        int sum = 0;
        
        if(d1==d2&&d2==d3) {
            sum = 10000 + d1 * 1000; 
            System.out.println(sum);
        } else if(d1==d2) {
            sum = 1000+d1*100;
            System.out.println(sum);
        } else if(d2==d3) {
            sum = 1000+d2*100;
            System.out.println(sum);
        } else if(d1==d3) {
            sum = 1000+d3*100;
            System.out.println(sum);
        }else if(d1!=d2&&d2!=d3&&d1!=d3) {
            sum = Math.max(d1,Math.max(d2,d3))*100;
            System.out.println(sum);
        }
    }
}