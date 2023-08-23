class Solution {
    public String solution(String s, int n) {
        
        //char 변환
        char[] ch = s.toCharArray();
        //int 변환을 위한 어레이
        int[] num = new int[ch.length];
        //인트 변환
        for (int i = 0 ; i < ch.length ; i++) num[i] = (int)ch[i];
       
        // 인트 출력  // 이거 말은 되죠?
        for (int j = 0; j< num.length ; j++) {
            if ( num[j] <= 90 && num[j]+n > 90 )num[j] = num[j] + n -26;
            else if (num[j] <= 122 && num[j]+n > 122)num[j] = num[j] + n -26;
            else if(num[j]==32 ) continue;
            else num[j] = num[j] + n;
        }
    
        // 실행 한번 눌러 보세요 그래야 보일거같아요

        char[] cha = new char[num.length];
        for (int k = 0 ; k < num.length ; k++) {

            cha[k] = (char)num[k];
        }
        String answer = new String(cha);
        
        
        
        return answer;
    }
}