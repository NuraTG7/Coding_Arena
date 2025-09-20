public class Leaders{
    public static void main(String[] args){
        int[] nums = {16, 7, 4, 3, 5, 2};
        int n = nums.length;
        int max = nums[n-1];
        System.out.print(max+ " ");

        for(int i = n-2; i > -1; i--){
            if(nums[i] > max){
                max = nums[i];
                System.out.print(max + " ");
            }
        }
    }
}