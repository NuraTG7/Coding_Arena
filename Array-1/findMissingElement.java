public class findMissingElement{
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 5};
        int n = nums.length+1;
        int sum1 = (n*(n+1))/2, sum = 0;

        for(int i = 0; i<n-1;i++){
            sum += nums[i];
        }
        System.out.print(sum1-sum);
    }
}