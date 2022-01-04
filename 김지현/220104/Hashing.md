## Hashing

오버헤드 되었을 경우를 생각해야겠다

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    static final int r= 31;
    static final int M = 1234567891;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String eng = br.readLine();
        long result =0;
        for(int i=0; i<L; i++){
            result += (long) (eng.charAt(i)-96) * pow(r,i); // Math.pow는 일정 크기가 넘으면 자체 생략해버린다
           
        }

        bw.write(result%M + "\n");
        bw.flush();
        bw.close();

        
    }

    public static long pow(int r, int x){
         long result =1;
        // if(x ==0){
        //     return 1;
        // }
        // for(int i=1; i<=x; i++){ // for문은 더 오래걸린다 
        //     result = result*r;
        // }
        // return result%M;

        return x==0? 1: r*pow(r,x-1) %M; // r^i 할때 항상 M을 나눠주어야한다 

    }
        
}

```