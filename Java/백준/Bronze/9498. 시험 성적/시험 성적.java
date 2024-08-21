import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int point = scan.nextInt();
        
        if(90 <= point && point <= 100) {
            System.out.println("A");
        } else if(80 <= point && point <= 89) {
            System.out.println("B");
        } else if(70 <= point && point <= 79){
            System.out.println("C");
        } else if(60 <= point && point <= 69){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}