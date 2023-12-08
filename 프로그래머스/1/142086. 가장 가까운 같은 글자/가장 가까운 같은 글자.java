import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        char[] s_c = s.toCharArray();

        for (int i = 0; i < s_c.length; i++) {
            char c = s_c[i];
            int num = 0;

            if (i == 0) {
                answer[0] = -1;
                continue;
            }

            for (int j = i-1; j >= 0 ; j--) {
                char c1 = s_c[j];
                num++;

                if (c1 == c ) break;

                if ( j == 0 ) num = -1;
            }

            answer[i] = num;

        }
        return answer;
    }
}