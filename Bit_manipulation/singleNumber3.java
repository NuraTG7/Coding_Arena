class Solution {
    public int[] singleNumber(int[] nums) {
        long xorr = 0;

        for (int num : nums) {
            xorr ^= num;
        }

        long right = xorr & -xorr;

        int b1 = 0, b2 = 0;
        for (int num : nums) {
            if ((num & right) != 0)
                b1 ^= num;
            else
                b2 ^= num;
        }

        return new int[]{b1, b2};
    }
}
