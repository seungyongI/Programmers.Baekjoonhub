class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        char[] result = new char[str1.length()+str2.length()];

        for (int i = 0; i < result.length; i += 2) {
            result[i] = a[i / 2];
        }
        for (int i = 1; i < result.length; i += 2) {
            result[i] = b[i / 2];
        }

        String str = new String(result);

        answer = str;
        return answer;
    }
}