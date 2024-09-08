class Solution {
    public int solution(int order) {
        int count = 0;
        String number = "" + order;        // Integer.toString(order)
        
        for (char num : number.toCharArray()) {
            if(num=='3' || num=='6' || num=='9') {
                count++;
            }
        }
        return count;
    }
}