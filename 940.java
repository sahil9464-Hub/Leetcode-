class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;

        int[] dp = new int[26];

        for(char c : s.toCharArray()){
            int index = c -'a';

            int total = 1;

            for(int i = 0; i < 26;i++){
                total = (total + dp[i]) % mod;
            }
            dp[index] = total;
        }

        int answer = 0;

        for(int i = 0; i < 26;i++){
            answer = (answer + dp[i]) % mod;
        }

        return answer;       
    }
}
