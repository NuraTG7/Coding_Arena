class upperBound{

    public static int upperbound(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1, ans = n;
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        System.out.println(upperbound(nums, target));
    }
}