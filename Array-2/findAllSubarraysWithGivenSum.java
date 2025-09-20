import java.util.*;

public class findAllSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 0, 0, 4, 2};
        int k = 6;
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Initialize map with prefix sum 0.
        for (int i = 0; i < n; i++) {
            System.out.println(mpp);
            preSum += arr[i];
            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);

            System.out.println("preSum: " + preSum + ", remove: " + remove + ", count: " + cnt);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        System.out.println("The number of subarrays is: " + cnt);
    }
}
