class Solution {
    public int solution(String t, String p) {
        int answer =0;

        long p_num = Long.parseLong(p);
        long ch = 0;
        int t_size = t.length();
        int p_size = p.length();
        int num = 0;
        int i = 0;

        while (true) {
            if (p_size > t_size) break;
            ch = Long.parseLong(t.substring(i,p_size++ ));
            if (ch <= p_num) num++;
            i++;
        }
        
        answer = num;
        return answer;
    }
}