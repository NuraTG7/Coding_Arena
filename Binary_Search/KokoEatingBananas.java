class KokoEatingBananas{
    public static int findMax(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            maxi = Math.max(maxi, nums[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] piles, int target){
        int totalHours = 0;
        for(int i = 0; i < piles.length; i++){
            totalHours += Math.ceil(piles[i]/ (double)target);
        }
        return totalHours;
    }

    public static int minimumRateToEatBananas(int[] piles, int hrs){
        int low = 1, high = findMax(piles);
        int ans = high;

        while(low <= high){
            int mid = low +(high - low) / 2;

            int totalHours = calculateTotalHours(piles, mid);
            if(totalHours <= hrs){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] nums = {7, 15, 6, 3};
        int hrs = 8;
        int ans = minimumRateToEatBananas(nums, hrs);
        System.out.println(ans);
    }
}