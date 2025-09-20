public class splitArray_LargestSum{
    public static int countPartitions(int[] arr, int maxSum){
        int partitions = 1, sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] <= maxSum){
                sum += arr[i];
            }
            else{
                sum = arr[i];
                partitions++;
            }
        }
        return partitions;
    }

    public static int splitArray(int[] arr, int k){
        int low  = 0, high = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > low) low = arr[i];
            high += arr[i];
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            int partitions = countPartitions(arr, mid);
            if(partitions > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int m = 3; 
        System.out.println(splitArray(arr, m));
    }
}