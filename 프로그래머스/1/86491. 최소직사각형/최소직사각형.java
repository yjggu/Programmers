class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;   
        int max_height = 0; 

        for (int i = 0; i < sizes.length; i++) {  // 모든 명함 사이즈 돌아볼건데
            int w = Math.max(sizes[i][0], sizes[i][1]);   // 가로 세로 다 돌아서 제일 긴 길이 뽑고
            int h = Math.min(sizes[i][0], sizes[i][1]);   // 가로 세로 다 돌아서 제일 짧은 길이 뽑아
            
            max_width = Math.max(max_width, w);   // 최대길이랑 현재 비교
            max_height = Math.max(max_height, h); // 최소길일아 현재 비교
        }

        return max_width * max_height; 
    }
}