class Solution {
    public int solution(String my_string) {
        return my_string.chars()                    // 각 문자를 떼서
                        .filter(Character::isDigit) // 숫자에 해당하는 문자 추려
                        .map(Character::getNumericValue)    // 문자를 숫자로 변환
                        .sum();
    }
}
