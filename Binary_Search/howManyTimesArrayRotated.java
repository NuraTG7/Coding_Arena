class howManyTimesArrayRotated{
    public static void main(String[] args){
        int[] arr = {4,5,6,7,1,2,3};
        int low = 0, high = arr.length-1, ind = -1;
        int ans = Integer.MAX_VALUE;;
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    ans = arr[low];
                    ind = low;
                }
                break;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    ans = arr[low];
                    ind = low;
                }
                low = mid+1;
            }
            else{
                if(arr[mid] < ans){
                    ans = arr[mid];
                    ind = mid;
                }
                high = mid - 1;
            }
        }
        System.out.println(ind);
    }
}