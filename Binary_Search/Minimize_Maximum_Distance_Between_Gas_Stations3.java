import java.util.*;

public class Minimize_Maximum_Distance_Between_Gas_Stations3{

    public static int countGasStations(int[] arr, double dist){
        int n = arr.length;
        int count  = 0;

        for(int i = 0; i< n-1; i++){
            int numberInBetween = (int)((arr[i+1]-arr[i])/dist);
            if((arr[i+1]-arr[i]) == dist*numberInBetween){
                numberInBetween--;
            }
            count += numberInBetween;
        }
        return count;
    }

    public static double minimiseMaxDistance3(int[] arr, int k){
        int n = arr.length;
        double low = 0, high = 0;

        for(int i = 0; i<n-1; i++){
            high = Math.max(high, arr[i+1] - arr[i]);
        }

        double diff = 1e-6;
        while(high - low > diff){
            double mid = (low + high) / (2.0);
            int count = countGasStations(arr, mid);

            if (count > k){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return high;
    }


    public static void main(String[] args){
        int[] arr = {1, 13, 17, 23, 32};
        int k = 4;
        double ans = minimiseMaxDistance3(arr, k);
        System.out.println(ans);
    }
}