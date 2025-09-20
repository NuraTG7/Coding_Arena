class SearchEleInMinSortArray{
    int search(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n-1;
        while(low <= high){
            
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }
            System.out.println(low);
            System.out.println(mid);
            System.out.println(high);

            if(nums[low] <= nums[mid]){
                System.out.println("left");
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                System.out.println("right");
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {3, 1, 2, 3, 3, 3, 3, 3};
        int target = 1;
        SearchEleInMinSortArray obj = new SearchEleInMinSortArray();
        int idx = obj.search(nums, target);
        System.out.println(idx);
    }
}