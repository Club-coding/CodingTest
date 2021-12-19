import java.util.ArrayList;
import java.util.Scanner;


public class Main2 {

    // 그룹단어 체커
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        char[] words = new char[n];
        for(int i=0; i<n; i++){
            words = sc.next().toCharArray();
            boolean check = checkword(words);
            if(check){
                count += 1;
            }
                
        }
        System.out.println(count);
        
        //System.out.println(words.get(i));
        // 단어를 하나씩 받아올려했다. 
        

    }

    public static boolean checkword(char[] check){
        boolean[] alphabet = new boolean[26];
        for(int i=0;i<check.length; i++){
            if(alphabet[check[i]-'a'] && check[i] != check[i-1]){
                return false;
            }
            else if(!alphabet[check[i]-'a']){
                alphabet[check[i]-'a'] = true;
            }

        }
        return true;
    }
    
}
