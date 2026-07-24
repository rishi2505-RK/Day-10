class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;

        long ans = 0;
        int even = 1, odd = 0;
        int parity = 0;

        for (int num : arr) {
            parity ^= (num & 1);

            if (parity == 0) {
                ans = (ans + odd) % MOD;
                even++;
            } else {
                ans = (ans + even) % MOD;
                odd++;
            }
        }

        return (int) ans;
    }
}