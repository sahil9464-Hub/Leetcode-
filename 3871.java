class Solution {
    public long countCommas(long n) {

        long ans = 0;

        // 1 comma: 1,000 to 999,999
        if (n >= 1000){
            long count = Math.min(n, 999999L) - 1000L + 1;
            ans += count;
        }

        // 2 commas: 1,000,000 to 999,999,999
        if (n >= 1000000L){
            long count = Math.min(n, 999999999L) - 1000000L + 1;
            ans += count * 2;
        }

        // 3 commas: 1,000,000,000 to 999,999,999,999
        if (n >= 1000000000L){
            long count = Math.min(n, 999999999999L)
                       - 1000000000L + 1;
            ans += count * 3;
        }

        // 4 commas: 1,000,000,000,000 to 999,999,999,999,999
        if (n >= 1000000000000L){
            long count = Math.min(n, 999999999999999L)
                       - 1000000000000L + 1;
            ans += count * 4;
        }

        // 5 commas: 1,000,000,000,000,000
        if (n >= 1000000000000000L){
            ans += 5;
        }

        return ans;
    }
}
