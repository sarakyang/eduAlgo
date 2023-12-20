import java.util.*;

class Solution {
  
    public int solution(int[] ingredient) {
        int answer = 0;

       StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
        }

        for(int i = 0 ; i < sb.length()-3; i++) {
            if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '2' && sb.charAt(i + 2) == '3' && sb.charAt(i + 3) == '1') {
                answer++;
                sb = sb.delete(i, i + 4);

                i -= 5;
                if ( i < 0 ) i = -1;
            }
        }

        return answer;
    }
}