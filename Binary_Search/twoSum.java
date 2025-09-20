import java.util.HashMap;
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String args[]){
        int[] nums = {2, 8, 7 ,6, 14};
        int target = 40;
        int[] nithiya = twoSum(nums, target);

        for (int i = 0; i < nithiya.length; i++) {
            System.out.print(nithiya[i]);
            if (i < nithiya.length - 1) {
                System.out.print(", ");
            }
        }
    }
}