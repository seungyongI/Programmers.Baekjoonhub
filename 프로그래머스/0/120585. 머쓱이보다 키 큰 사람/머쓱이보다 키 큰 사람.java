class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int friend = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                friend++;
            }
        }
        answer = friend;

        return answer;
    }
}