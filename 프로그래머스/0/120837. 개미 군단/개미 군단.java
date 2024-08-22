class Solution {
    public int solution(int hp) {
        int jang = hp/5;
        hp %= 5 ;
        int byeong = hp/3;
        hp %= 3 ;
        int ilban = hp;
        
     return jang+byeong+ilban;
    }
}