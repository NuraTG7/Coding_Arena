import java.util.HashMap;

class FruitAndBaskets{
    public int KBasketsI(int[] nums, int k){
        int maxlen = 0;
        int l = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int r = 0; r< nums.length; r ++){
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0)+1);

            while(mpp.size() > k){
                mpp.put(nums[l], mpp.get(nums[l])-1);
                if(mpp.get(nums[l]) == 0){
                    mpp.remove(nums[l]);
                }
                l ++;
            }

            if(mpp.size() <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
        }
        return maxlen;
    }

    public int KBasketsII(int[] nums, int k){
        int l = 0;
        int maxlen =0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int r = 0; r < nums.length; r ++){
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);
            if(mpp.size() > k){
                mpp.put(nums[l], mpp.get(nums[l])-1);
                if (mpp.get(nums[l]) == 0){
                    mpp.remove(nums[l]);
                }
                l ++;
            }

            if(mpp.size() <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
        }
        return maxlen;
    }


    public static void main(String[] args) {
        FruitAndBaskets obj = new FruitAndBaskets();
        int[] nums = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int k = 2;
        System.out.println(obj.KBasketsII(nums, k));
    }
}