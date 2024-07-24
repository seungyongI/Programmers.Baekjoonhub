class Solution {
    public int solution(int[] array, int n) {
       int answer = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                sum++;
            }
        }
        answer = sum;
        return answer;
    }
}