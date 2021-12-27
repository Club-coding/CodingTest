## 큐

처음에는 scanner로 받았더니 시간초과가 발생했다
switch - case 오랜만이당 

```java
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            switch (com) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    arrayList.add(num);
                    break;
            
                case "pop":
                    if(!arrayList.isEmpty()){
                        int tmp = arrayList.remove(0);
                        System.out.println(tmp);
                    }
                    else{
                        System.out.println(-1);
                    }    
                    break;

                case "size":
                    System.out.println(arrayList.size());
                    break;
                case "empty":
                    System.out.println((arrayList.isEmpty())? 1: 0);
                    break;
                case "front":
                    if(!arrayList.isEmpty()){
                        System.out.println(arrayList.get(0));
                    }
                    else{
                        System.out.println(-1);
                    }
                    break;

                case "back":
                     if(!arrayList.isEmpty()){
                        System.out.println(arrayList.get(arrayList.size()-1));
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }


}



```