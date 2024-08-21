class Solution {
    public long solution(int price, int money, int count) {
        // price 이용료, money 갖고있던 돈, count 몇번 탈건데
        long totalCost = 0;

        for (int i = 1; i <= count; i++) {  // 놀이기구 몇번 탈건지 일단 계산
            totalCost += price * i;     // 얼마 들지 각 재고
        }

        long shortage = totalCost - money;  // 얼마 남나 봐봐

        return shortage > 0 ? shortage : 0; // 남는돈이 0원보다 많으면 남는돈 반환, 아니면 0
    }
}