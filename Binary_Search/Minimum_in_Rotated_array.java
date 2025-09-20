class Minimum_in_Rotated_array{
    public static void main(String[] args){
        int[] arr = {3, 1, 3};
        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;;
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    ans = arr[low];
                }
                break;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    ans = arr[low];
                }
                low = mid+1;
            }
            else{
                if(arr[mid] < ans){
                    ans = arr[low];
                }
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}