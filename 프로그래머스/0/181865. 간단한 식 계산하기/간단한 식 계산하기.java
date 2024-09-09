class Solution {
    public int solution(String binomial) {
        String[] part = binomial.split(" ");
        
        int a = Integer.parseInt(part[0]);
        String op = part[1];
        int b = Integer.parseInt(part[2]);
        
        switch(op) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
