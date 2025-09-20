class First_Last_Occurance_in_array {

    public static int lowerBound(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1, ans = n;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1, ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {3, 3, 1, 3, 3}; // Example array
        int target = 2;

        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);
        
        if(lb == nums.length || nums[lb] != target){
            System.out.println("[-1, -1]");
        } else {
            System.out.println("[" + lb + ", " + (ub - 1) + "]");
        }
    }
}



// TC :  2 * O(logN)
// SC = O(1)