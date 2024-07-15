import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chars = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if ((int) 'a' <= (int) chars[i] && (int) chars[i] <= (int) 'z') {
                chars[i] -= 32;
            } else {
                chars[i] += 32;
            }
            System.out.print(chars[i]);
        }
    }
}