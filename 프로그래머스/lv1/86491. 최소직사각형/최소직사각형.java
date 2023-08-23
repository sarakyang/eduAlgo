class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
         int w = 0;
        int h = 0;

        for (int i = 0 ; i< sizes.length ;i++ ) {
            if (sizes[i][0] > sizes[i][1]) {
                int org_w = sizes[i][0];
                int org_h = sizes[i][1];

                sizes[i][0] = org_h;
                sizes[i][1] = org_w;
            }
            if (w < sizes[i][0]) w = sizes[i][0];
            if (h < sizes[i][1]) h = sizes[i][1];
        }
        answer = w*h;
        return answer;
    }
}