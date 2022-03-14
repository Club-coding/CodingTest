import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int x = dp(n);
        System.out.println(x);

    }

    public static int dp(int n){
        while(true ){
            if(n== 1){
                return 1;
            } else if(n== 2){
                return 2;
            }
            return (dp(n-1)+dp(n-2))%10007;

            

        }
    }
   
}
