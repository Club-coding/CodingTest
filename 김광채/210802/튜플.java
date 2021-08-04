import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int[] solution(String s) {

        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            System.out.print(n + " ");
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println();
        System.out.println(map.toString());
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        return answer;
    }

}
/*
import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        for(String ss: arr){
            System.out.println(ss);
        }
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
*/
/*  내풀이
1. 집합을 다 뽑아낸 후, 1개부터 answer에 넣고, 만들어져있는 answer와 새로운 n개의 집합을 둘 다 정렬해 서로 다른 부분을 answer에 넣으면 튜플을 완성해간다.
(내선택 2번)
2. 집합연산을 통해 완성, 1개는 무조건 첫번째, 2개면 첫번째순을 밴 다음이 2번째 튜플 원소 .. 반복
*/
/*
class Solution {
    
    public String[] sort(String[] s){
        Arrays.sort(s, new Comparator<String>(){
            
            @Override 
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()){
                    return -1;
                }else if(o1.length() > o2.length()){
                    return 1; 
                }
                
                return 0;
            }
        });
        
        return s;
    }
    
    public int[] solution(String s) {
        int[] answer = {};
        ArrayList<String> listAnswer = new ArrayList<>();
        ArrayList<ArrayList<String>> sets= new ArrayList<ArrayList<String>>();
        
        // 집합배열로 바꾸기
        s = s.substring(1,s.length()-1);
        // System.out.println(s);
        s = s.replace("},{", "/");
        s = s.substring(1, s.length() - 1);
        // System.out.println(s);
        String[] splitedS = s.split("/");
        
        //집합의 순서대로 넣기 위해
        sort(splitedS);
       
        // 자바는 항상 참조형 변수에 new로 객체 생성해줘야함..
        for(int i = 0; i < splitedS.length; i++){
            sets.add(new ArrayList<String>());
        }
        
        //sets에 집합 전체를 넣어둠
        for(int i = 0; i < splitedS.length; i++){
            String[] temp = splitedS[i].split(",");
            for(String ss: temp){
                sets.get(i).add(ss);
                //System.out.print(ss + " ");
            }
            //System.out.println();
        }
        
        listAnswer.add(sets.get(0).get(0));
        Set<String> set = new HashSet<>(listAnswer);
        
        
        // 집합의 길이순으로 만들어진 튜플(listAnswer)을 자기보다 한개 더 긴 집합과 차집합으로 listAnswer 순서를 만들어줌
        for(int i = 1; i < sets.size(); i++){
            Set<String> difference = new HashSet<>(sets.get(i));
            difference.removeAll(set);
            
            for(String diff: difference){
                listAnswer.add(diff);
            }
            
            set = new HashSet<>(listAnswer);
        }
        
        answer = new int[listAnswer.size()];
        for(int i = 0; i < listAnswer.size(); i++){
            answer[i] = Integer.parseInt(listAnswer.get(i));
        }
        
        
        return answer;
    }
}

*/










/*
import java.util.*;
class Solution {
    //정수형 배열 길이를 토대로 정렬
     class lengthCompare implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a.length < b.length)
                return -1;
            else if(a.length > b.length)
                return 1;
            return 0;
        }
    }
    public int[] solution(String s) {
        //문자열 처리를 하여 {"1,2,3", "3,4","4,3,6"}
        s = s.replace("{","");
        s = s.substring(0,s.length()-2);
        String[] strSet = s.split("},");
        
        ArrayList<int[]> sets = new ArrayList<>();
        //각각 원소 집합의 원소들을 정수형 배열로 바꾼 후 sets에 넣는다. [[1,2,3],[3,4],[4,3,6]]
        for(int i = 0; i < strSet.length; i++){
            String[] temp = strSet[i].split(",");
            int[] intemp = new int[temp.length];
            for(int j = 0; j < temp.length; j++){
                intemp[j] = Integer.parseInt(temp[j]);
            }
            //원소 배열들
            for(int j = 0; j < temp.length; j++){
                sets.add(intemp);
            }
        }
        
        //정수형 배열의 길이가 작은 순으로 정렬
        Collections.sort(sets,new lengthCompare());    
        
        // 컬렉션 집합의 linkedhashset을 이용하여 중복된 것이 없고 들어온 순서를 지키는 자료구조 사용
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < sets.size(); i++){
            for(int j = 0; j < sets.get(i).length; j++){
                set.add(sets.get(i)[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int k = 0;
        while(iter.hasNext()){
            answer[k++] = iter.next();
        }
        return answer;
    }
   
}

*/