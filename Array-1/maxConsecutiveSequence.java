public class maxConsecutiveSequence{
    public static void main(String[] args){
        int[] nums = {1, 1, 0, 1, 1, 1};
        int i = 0, n = nums.length;
        int maxi = 0, seq = 0;


        while(i < n){
            if(nums[i] == 0){                
                seq = 0;
            }
            else{
                seq += 1;
            }
            i++;            
            maxi = Math.max(maxi, seq);
        }
        System.out.print(maxi);
    }
}