public class LengthofSubarraySumleK{
    public static void main(String[] args){
        int[] arr= {2, 5, 6, 7, 10};
        int target = 300000000;
        int sum = 0, mlen = 0, l = 0, r = 0;

        while(r < arr.length){
            sum = sum + arr[r];
            while(sum>target){
                sum -= arr[l++];
            }
            if(sum<=target){
                mlen = Math.max(mlen, r-l+1);
        }
            r++;
        }
        System.out.print(mlen);
    }
}