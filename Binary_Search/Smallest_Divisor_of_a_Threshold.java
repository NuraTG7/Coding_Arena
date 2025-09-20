// arr = [1, 2, 5, 9], threshold = 6
// 1. Consider Divisor = 4
// Ceil(1/4 + 2/4 + 5/4 + 9/4) = 1+1+2+3 = 7
// condition : 7 <= 6

// 1. Consider Divisor = 5
// Ceil(1/5 + 2/5 + 5/5 + 9/5) = 1+1+1+3 = 6
// condition : 6 <= 6 -> True and return

class Smallest_Divisor_of_a_Threshold {
    public static int sumByD(int[] nums, int div) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (int)Math.ceil((double)nums[i] / div);
        }
        return sum;
    }

    public static int SmallestDivisor(int[] nums, int limit) {
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxi) {
                maxi = num;
            }
        }

        int low = 1, high = maxi, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= limit) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6 ,7 ,8, 9};
        int threshold = 12;
        System.out.println(SmallestDivisor(nums, threshold));  // Output: 10
    }
}
