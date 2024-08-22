class Solution {
    public String solution(String cipher, int code) {
        // cipher : 암호 / code : 배수번째
        StringBuilder str = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            str.append(cipher.charAt(i));
        }

        return str.toString();
    }
}