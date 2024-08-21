import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1,n).filter(num -> num%2!=0).toArray();
        // 1~n까지 / num을 거를건데 num%2!=0 조건 만족하는 것만 / 배열로 
    }
}