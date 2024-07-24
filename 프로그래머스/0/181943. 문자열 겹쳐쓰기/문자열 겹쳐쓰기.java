class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] myChar = my_string.toCharArray();
        char[] overChar = overwrite_string.toCharArray();
        char[] result = answer.toCharArray();

        for (int i = 0; i < overChar.length; i++) {
            myChar[s] = overChar[i];
            s++;
        }
        my_string = new String(myChar);
        answer = my_string;
        return answer;
    }
}