class Solution {
    public int numDistinct(String s, String t) {
        int a = s.length();
        int b = t.length();

        int[][] dp = new int[a + 1][b + 1];

        for(int i = 0; i <= a;i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i <= a;i++){
            for(int j = 1; j <= b;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[a][b];

    }
}
