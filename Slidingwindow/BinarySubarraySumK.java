class BinarySubarraySumK{
    public int countsubs(int[] nums, int k){
        if(k < 0){
            return 0;
        }
        int l = 0;
        int count = 0;
        int sum = 0;
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > k){
                sum = sum-nums[l];
                l ++;
            }
            count += (r-l+1);
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {1, 0, 0, 1, 1, 0, 0, 1};
        int k = 2;
        BinarySubarraySumK obj = new BinarySubarraySumK();
        int count = obj.countsubs(nums, k) - obj.countsubs(nums, k-1);
        System.out.println(count);
    }
}