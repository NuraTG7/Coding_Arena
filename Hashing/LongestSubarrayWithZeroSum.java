public class LongestSubarrayWithZeroSum{
    public static void main(String[] args){
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxlen = 0, sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                maxlen = i+1;
            }
            else{
                if
            }
        }
    }
}