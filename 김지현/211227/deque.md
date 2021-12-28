## 덱

이번에는 linkedlist로 만들어보았다. 데헷

```java

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> dequeList = new LinkedList<>();
        for(int i=0; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            switch (com) {
                case "push_front":
                    int num = Integer.parseInt(st.nextToken());
                    dequeList.addFirst(num);
                    break;

                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    dequeList.add(num);
                    break;

            
                case "pop_front":
                    if(!dequeList.isEmpty()){
                        int tmp = dequeList.remove(0);
                        System.out.println(tmp);
                    }
                    else{
                        System.out.println(-1);
                    }    
                    break;
                
                case "pop_back":
                    if(!dequeList.isEmpty()){
                        int tmp = dequeList.remove(dequeList.size()-1);
                        System.out.println(tmp);
                    }
                    else{
                        System.out.println(-1);
                    }    
                    break;

                case "size":
                    System.out.println(dequeList.size());
                    break;
                case "empty":
                    System.out.println((dequeList.isEmpty())? 1: 0);
                    break;
                case "front":
                    if(!dequeList.isEmpty()){
                        System.out.println(dequeList.get(0));
                    }
                    else{
                        System.out.println(-1);
                    }
                    break;

                case "back":
                     if(!dequeList.isEmpty()){
                        System.out.println(dequeList.get(dequeList.size()-1));
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }


}


```