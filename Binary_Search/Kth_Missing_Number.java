import java.util.*;

public class Kth_Missing_Number{
    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        int missingCount = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            missingCount = vec[mid] - (mid + 1);
            if(missingCount < k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return missingCount + high + 1;
    }
    
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
