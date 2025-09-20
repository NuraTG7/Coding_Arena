import java.util.*;
public class largestSubarraywiith0Sum{
    public static void main(String[] args){
        int[] nums = {1, 2, -2, 4, -4};
        int maxi = 0;
        int sum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            sum+= nums[i];
            if(sum == 0){
                maxi = i+1;
            }
            else if(mpp.get(sum) != null){
                maxi = Math.max(maxi, i-mpp.get(sum));
            }
            else{
                mpp.put(sum, i);
            }
        }
        System.out.print(maxi);
    }
}