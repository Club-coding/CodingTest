class Solution {
    public int solution(String s) {
        int answer = 1001;
        
        //추가
        if(s.length() == 1){
            return 1;
        }
        // for 1~=n/2 자를 문자 길이
        // nowStr, count, zip, 
        // for i; i< 길이; i+=자른 문자열 길이
        //     if nowStr == substring: count++
        //     else: zip += str(count) + nowStr; count = 1; nowStr에 해당 문자 넣기
        //     for문 다돌아도 마지막에 다르거나 같아도 해당 nowStr과 count가 안들어감으로 추가
        // answer = min(answer, len(zip));
      
        for(int i = 1 ; i <= s.length() / 2; i++){
            String now = s.substring(0, i);
            int count = 0;
            String zip = "";

            for(int j = 0; j < s.length(); j += i){
                int endIdx = j+i >= s.length()? s.length(): j+i;
                if(now.equals(s.substring(j, endIdx))){
                    count++;
                }else{
                    if(count > 1){
                        zip += String.valueOf(count) + now;
                    }else{
                        zip += now;
                    }   
                    count = 1;
                    now = s.substring(j, endIdx);
                }
            }    
            
            if(count > 1){
                zip += String.valueOf(count) + now;
            }else{
                zip += now;
            }
            
            // System.out.println(zip);
            answer = Math.min(answer, zip.length());
        }
        
        return answer;
    }
}