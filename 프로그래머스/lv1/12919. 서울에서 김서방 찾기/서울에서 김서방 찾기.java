import java.util.Objects;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String b  = "";
        int x = 0; 
        
        for (int i = 0 ; i < seoul.length; i++) {
            // 이 표현을 알아야함 == 과 같지만 이것은 잘못된 것이지만 그냥 해주는 거임
            if (seoul[i].equals("Kim")) {
                break;
            }
            x++;
            
        }
        
        String s = "김서방은 ";
        String A = "에 있다";
        b = Integer.toString(x);
        answer = s+b+A;
        return answer;
    }
}