
public class maxConsecutiveOnes{
    public static void main(String[] args){
        int[] nums = {1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1};
        int cons = 0, maxi = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                cons += 1;
            }
            else{                
                maxi = Math.max(maxi, cons);
                cons = 0;
            }
        }
        System.out.print(maxi);
    }
}