class Solution {
    public int solution(String t, String p) {
        // t가 전체 숫자 문자열,  p가 나눌 숫자 문자열
        
        int count = 0;                       // 조건 만족하면 count해야 되고
        int pLength = p.length();            // p의 길이 각재고
        Long pValue = Long.parseLong(p);     // p 숫자로 변환 / 런타임에러나서 long으로 바꿈

        for (int i = 0; i <= t.length() - pLength; i++) {   // 순회할건데
            String sub = t.substring(i, i + pLength);       // 문자열 뽑아
            long subValue = Long.parseLong(sub);            // 뽑은 문자열은 숫자로 변환

            if (subValue <= pValue) {   // 뽑은 수가 p 보다 작으면
                count++;                // 카운트 +1
            }
        }

        return count; // 최종적으로 카운트된 값을 반환
    }
}