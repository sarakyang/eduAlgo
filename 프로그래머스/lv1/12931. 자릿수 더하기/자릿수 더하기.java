import java.util.*;

public class Solution {
    public int solution(int n) {
        // 이거 +1 해줘야함 
        int size = (int)(Math.log10(n));
        int a = 0;
        
        // 여기서 이거 해서 같은거 임 
        for (int i = 0 ; i <=size  ; i++) {
            a += n%10;
            n/= 10;
        }


        int answer = 0;
        answer = a;

        return answer;


    }
}