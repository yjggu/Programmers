class Solution {
    public int solution(String my_string) {
        StringBuilder tempNumber = new StringBuilder();
        int sum = 0;

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                tempNumber.append(ch); 
            } else {
                if (tempNumber.length() > 0) {
                    sum += Integer.parseInt(tempNumber.toString());
                    tempNumber.setLength(0);
                }
            }
        }

        if (tempNumber.length() > 0) {
            sum += Integer.parseInt(tempNumber.toString());
        }

        return sum; 
    }
}
