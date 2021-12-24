## 괄호 

예전에 파이썬으로 풀어본 기억이 있어서 좀 쉬웠다 

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int T = Integer.parseInt(st.nextToken());
        String[] arr = new String[T];
        for(int i=0; i<T; i++ ){
            arr[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(String a: arr){
           boolean tmp =  ps(a);
           if(tmp){
               bw.write("YES\n");
           }else{
               bw.write("NO\n");
           }
        }
        bw.flush();
        bw.close();


    }

    public static Boolean ps(String a){
        Stack<Character> stack = new Stack<>();
        char[] ch = a.toCharArray();
        if(ch[0] == ')'){
            return false;
        }
        else{
            stack.push(ch[0]);
            for(int i=1; i<ch.length; i++){
                if(stack.isEmpty()){
                    stack.push(ch[i]);
                }
                else if(ch[i] != stack.peek() && stack.peek() == '(' && ch[i] == ')'){
                    stack.pop();
                }
                else{
                    stack.push(ch[i]);
                }
            }
            if(stack.isEmpty()){
                return true;
            }else{
                return false;
            }
            
        }
    }
}


```