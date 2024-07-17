class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = 2*a*b;
        if (answer1 >= answer2) {
            answer = answer1;
        } else {
            answer = answer2;
        }
        return answer;
    }
}