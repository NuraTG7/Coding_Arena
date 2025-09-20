class MaxConsecOnes {
    public int countOneI(int[] nums, int k) {
        int len = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {
            int zeroes = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroes += 1;
                }
                if (zeroes <= k) {
                    len = j - i + 1;
                    maxlen = Math.max(maxlen, len);
                } else {
                    break;
                }
            }
        }

        return maxlen;
    }

    public int countOneII(int[] nums, int k){
        int len = 0;
        int maxlen = 0;
        int zeroes = 0;
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0){
                zeroes ++;
            }
            while(zeroes > k){
                if(nums[l] == 0){
                    zeroes --;
                }
                l++;
            }
            if(zeroes <= k){
                len = r - l + 1;
                maxlen = Math.max(len, maxlen);
            }
        }
        return maxlen;
    }

    public int countOneIII(int[] nums, int k){
        int len = 0;
        int maxlen = 0;
        int zeroes = 0;
        int l = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0){
                zeroes ++;
            }
            if (zeroes > k){
                if (nums[l] == 0){
                    zeroes --;
                }
                l++;
            }
            if(zeroes<=k){
                len = r-l+1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }


    public static void main(String[] args) {
        MaxConsecOnes obj = new MaxConsecOnes();
        int[] nums = {1, 0, 1, 1, 0, 1, 0, 1};
        int k = 2;
        System.out.println("Maximum consecutive 1s: " + obj.countOneIII(nums, k));
    }
}
