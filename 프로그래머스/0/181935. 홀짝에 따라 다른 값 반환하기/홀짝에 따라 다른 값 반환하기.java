import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int answer;
        if (n % 2 == 0) {
            answer = IntStream.rangeClosed(1, n)
                    .filter(data -> data % 2 == 0)
                    .map(data1 -> data1 * data1)
                    .sum();
        } else {
            answer = IntStream.rangeClosed(1, n)
                    .filter(data1 -> data1 % 2 != 0)
                    .sum();
        }
        return answer;
}
}