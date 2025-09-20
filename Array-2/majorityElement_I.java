public class majorityElement_I{
    public static void main(String[] args){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int count = 0, ele = 0;

        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.print(ele);
    }
}