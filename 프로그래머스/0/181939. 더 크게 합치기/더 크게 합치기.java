class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int answer1 = Integer.parseInt(""+a+b);
        int answer2 = Integer.parseInt(""+b+a);
        if (answer1 >= answer2) {
            answer = answer1;
        } else {
            answer = answer2;
        }
        
        return answer;
    }
}