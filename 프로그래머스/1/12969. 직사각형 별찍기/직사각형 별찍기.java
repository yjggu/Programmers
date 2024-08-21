import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 가로길이니까 열
        int m = sc.nextInt();   // 몇 개 행 돌릴건가
        
        for (int i = 0; i < m; i++) {   // 행 m개 돌아갈건데
            for (int j = 0; j < n; j++) {   // 한 행당 n개씩 별 찍어야지
                System.out.print("*");
            }
            System.out.println();   // 한 행 끝나면 줄바꿔
        }
    }
}