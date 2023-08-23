class Solution {
    public boolean solution(String s) {
        
        boolean answer = true;

        if (s.length() == 4) answer = true;
        else if (s.length() == 6) answer = true;
        else answer = false;

        char[] ch = s.toCharArray();

        if (answer) {
            for (int i = 0; i < s.length(); i++) {
                // 이게 수인지 아닌지 판별해주는 메소드 
                if (Character.isDigit(ch[i])) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }

        
        }
        return answer;
    }
}
