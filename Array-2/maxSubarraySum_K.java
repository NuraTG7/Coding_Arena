public class maxSubarraySum_K{
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxi = 0, sum = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            maxi = Math.max(maxi, sum);
        }
        System.out.print(maxi);
    }
}