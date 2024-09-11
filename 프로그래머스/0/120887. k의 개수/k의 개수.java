class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        String k_str = String.valueOf(k);       // k를 문자열로 변환
        
        for(int x=i; x<=j; x++) {               // 범위 추리고
            String str = String.valueOf(x);     // 범위에 있는 x를 문자열로 변환
        
            for(int y=0; y<str.length(); y++) {
                if(str.charAt(y) == k_str.charAt(0)) {   // k이랑 같은게 있나 확인
                    count++;
                }
            }
        }
        return count;
    }
}