
class Solution {
    public int solution(String s) {
        int answer = 0;
       String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       

        for (int a = 0 ; a< list.length ; a++) {  
            if ( s.contains(list[a])) {
                s = s.replaceAll(list[a], Integer.toString(a));
            }
        }
        answer = Integer.valueOf(s);
        return answer;
    }
}