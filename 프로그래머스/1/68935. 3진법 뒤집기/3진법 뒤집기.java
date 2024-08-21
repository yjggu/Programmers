class Solution {
    public int solution(int n) {

        String n3 = Integer.toString(n, 3);  // 10진수 n을 3진법으로 변환
        
        String ren3 = new StringBuilder(n3).reverse().toString();
                                // n3이를 뒤집고 문자로 바꿔
        
        int answer = Integer.parseInt(ren3, 3);
        // 3진법인 ren3이를 10진법을 변환해
        
        return answer;
    }
}