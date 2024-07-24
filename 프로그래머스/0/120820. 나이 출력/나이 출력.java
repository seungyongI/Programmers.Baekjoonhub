class Solution {
    public int solution(int age) {
        int answer = 0;
        for(int i = 2022; i > 0; i--){
            if(age == 1) {
                answer = i;
                break;
            }
            age--;
        }
        return answer;
    }
}