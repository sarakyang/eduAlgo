import java.util.*;

class Solution {
        public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> alphabet = new ArrayList<>();
        for (int i = 97; i <= 122; i++) {
            alphabet.add(String.valueOf((char) i));
        }

        char[] skipWord = skip.toCharArray();
        List<Integer> skipNum = new ArrayList<>();
        for (char c : skipWord) {
            int location = findLocation(c , alphabet);
            skipNum.add(location);
        }

        char[] words = s.toCharArray();
        for (char word : words) {
            int loaction = findLocation(word,alphabet);
            int coin = 0;
            while (coin < index) {
                coin++;
                loaction++;
                if(skipNum.contains(loaction %26)) coin--;
                loaction %= 26; 
            }
            answer += alphabet.get(loaction);
        }

        return answer;
    }
    public int findLocation (char a, List<String> list) {
        String s1 = String.valueOf(a);
        return list.indexOf(s1);
    }
}
