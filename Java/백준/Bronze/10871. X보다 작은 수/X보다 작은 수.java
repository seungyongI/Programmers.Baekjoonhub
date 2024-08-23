import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br 
            = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw 
            = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        int num = 0;
        
        for(int i = 0; i < n; i++) {
            num = Integer.parseInt(arr[i]);
            if(num < x) {
                bw.write(num+" ");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
        
    }
}