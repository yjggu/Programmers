class Solution {
    public String[] solution(String[] names) {
        int leng = (names.length + 4) / 5;
        String[] result = new String[leng];
        int idx = 0;
        
        for (int i=0; i<names.length; i+=5){
            result[idx] = names[i];
            idx++;
        }
        return result;
    }
}