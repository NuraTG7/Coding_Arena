import java.lang.*;
import java.util.*;

class Minimum_days_to_get_M_bouquets{
    public static boolean possible(int[] nums, int day, int m, int k){
        int cnt = 0, flowers = 0;

        for(int num:nums){
            if(num <= day){
                cnt++;
            }
            else{
                flowers += (cnt / k);
                cnt = 0;
            }
        }
        flowers += (cnt / k);
        return flowers >= m;
    }

    public static int roseGarden(int[] nums, int m, int k){
        long val = (long)m * k;

        if(nums.length < val){
            return -1;
        }

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        for(int num: nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        while(low <= high){
            int mid = (low + high)/2;
            if (possible(nums, mid, m, k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }

        public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3, m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}

