

import java.util.*;
public class threeSum{
    public static List<List<Integer>> Solution(int[] nums, int target){
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i< n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j<n; j++){
                int three = -(nums[i]+nums[j]);
                if(set.contains(three)){
                    List<Integer> lst = Arrays.asList(nums[i], nums[j], three);
                    Collections.sort(lst);
                    st.add(lst);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args){

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();
        ans = Solution(nums, target);
        System.out.println(ans);
    }
}


// import java.util.*;
// public class threeSum{
//     public static List<List<Integer>> Solution(int[] nums){
//         int n = nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(nums);

//         for(int i = 0; i< n- 2; i++){
//             if (i > 0 && nums[i] == nums[i - 1]) continue;
//             int j = i+1, k = n-1;
//             while(j < k){
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if (sum < 0){
//                     j++;
//                 }
//                 else if(sum > 0){
//                     k--;
//                 }
//                 else{
//                     List<Integer> lst = Arrays.asList(nums[i], nums[j], nums[k]);
//                     Collections.sort(lst);
//                     ans.add(lst);
//                     while (j < k && nums[j] == nums[j + 1]) j++;
//                     while (j < k && nums[k] == nums[k - 1]) k--;
//                     j++;
//                     k--;                
//                 }
//             }
//         }
//         return ans;

//     }

//     public static void main(String[] args){
//         int[] nums = {-1, 0, 1, 2, -1, -4};
//         List<List<Integer>> ans = new ArrayList<>();
//         ans = Solution(nums);
//         System.out.println(ans);
//     }
// }
// """