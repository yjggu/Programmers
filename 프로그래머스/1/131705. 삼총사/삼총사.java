
class Solution {
    public int solution(int[] number) {
        
        int answer = 0;
        for(int i = 0; i < number.length; i++) {    // 첫번째 숫자
            for(int j = i+1; j <  number.length; j++) { // 두번째 숫자
                for(int k = j+1; k < number.length; k++) {  // 세번째 숫자
                    if(number[i]+number[j]+number[k] == 0)
                        answer++;
                }
            }
        }
        return answer;
    }
}


// import java.util.Arrays;

//         Arrays.sort(number);  // 일단 배열 오름차순으로 놔봐
//         int count = 0;        // 삼총사 됐을 때 카운트 해야지

//         // 앞에 하나 고정하고 뒤에 나머지 두개까지 더했을 때 0 나오면 되잖아
//         for (int n1 = 0; n1 < number.length - 2; n1++) {
//             int n2 = n1 + 1;   // n2는 n1보다는 커야하니까
//             int n3 = number.length - 1; // 얘는 뒤에서부터 가자

//             while (n2 < n3) {
//                 int sum = number[n1] + number[n2] + number[n3];

//                 if (sum == 0) { // 다 더한게 0이면 
//                     count++;    // 카운트하면 되잖아
//                     n2++;
//                     n3--;
//                 } else if (sum < 0) {
//                     n2++;  // 합이 0보다 작으면 더 큰 수를 더해야하니까 n2 이동
//                 } else {
//                     n3--; // 합이 0보다 크면 더 작은수를 더해야하니까 n3 이동
//                 }
//             }
//         }

//         return count;