# 단어 정렬

array.sort에도 새롭게 정렬할 수 있는
comparator라는것이 있다는 것을 알게 되었다. 

```
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }

        // for(String w: words){
        //     for(int i=0; )
        // }

        // 알파벳 순서 정렬 
        Arrays.sort(words, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length()- s2.length();
                }
            }
        });

        System.out.println(words[0]);
        for(int i=1; i<n; i++){
            if(!words[i].equals(words[i-1])){
                System.out.println(words[i]);
            }
        }
       // System.out.println(Arrays.toString(words));

        // for(String w: words){
        //     // 길이에 따라서 정렬 어캐함 

        //     System.out.println(w.length());
        // }

    }

}

```