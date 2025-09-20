class lowerBound{
    public static void  main(String[] args){
        int[] nums = {1,2,2,3};
        int x = 2;
        int n = nums.length;
        int res = n;
        int left = 0, right = n-1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] >= x){
                res = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(res);
    }
}