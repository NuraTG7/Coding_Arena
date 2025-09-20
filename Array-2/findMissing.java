public class findMissing{
    public static void main(String[] args){
        int n = 5;
        int[] nums = {1, 2, 3, 5, 0};
        int sum1 = 0, sum2 = 0;

        sum1 = (n*(n+1))/2;
        for(int it:nums){
            sum2 += it;
        }

        System.out.print(sum1-sum2 + " ");

        int xor = 0;

        for(int i = 0; i< n; i++){
            xor ^= nums[i];
            xor ^= i+1;
        }
        System.out.print(xor);
    }
}