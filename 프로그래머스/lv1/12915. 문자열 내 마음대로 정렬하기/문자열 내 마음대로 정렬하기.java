import java.util.Arrays;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] ch = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ch[i] =  strings[i].substring(n,n+1);
            ch[i] += strings[i];
        }
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            answer[i] = ch[i].substring(1);
        }
        return answer;
    }
}