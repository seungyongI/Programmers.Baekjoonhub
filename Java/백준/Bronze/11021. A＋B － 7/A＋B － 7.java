import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= t; i++) {
            String[] sarr = br.readLine().split(" ");
            int a = Integer.parseInt(sarr[0]);
            int b = Integer.parseInt(sarr[1]);
            
            bw.write("Case #"+i+": "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}