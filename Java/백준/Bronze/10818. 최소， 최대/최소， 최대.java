import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int num = 0;
        int min = Integer.parseInt(input[0]);
        int max = Integer.parseInt(input[0]);
        
        for(int i = 0; i < n; i++) {
            num = Integer.parseInt(input[i]);
            
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        bw.write(min+" "+max);
        
        bw.flush();
        bw.close();
        br.close();
    }
}