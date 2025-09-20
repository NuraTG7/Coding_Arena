//Algorithm
// j->0 to n-1
// nums[j]==0 swap(nums[i],nums[j]) i++ j++
// nums[j]==1 j++
// nums[j]==2 swap(nums[j],nums[k]) k--


public class sort012{
    public static void main(String[] args){
        int[] nums = {1, 0, 1, 0, 0, 2, 1, 0};
        int i = 0, j =0, k = nums.length-1;

        while(j <= k){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 1){
                j++;   
            }
            else{
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            }
        }

        for(int v = 0; v < nums.length; v++){
            System.out.print(nums[v] + " ");
        }
    }
}