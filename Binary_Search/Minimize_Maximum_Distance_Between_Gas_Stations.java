public class Minimize_Maximum_Distance_Between_Gas_Stations{
    public static double minimiseMaxDistance1(int[] arr, int k){
        int n = arr.length;
        int[] howMany = new int[n-1];

        for(int gasStation = 0; gasStation < k; gasStation++){
            double maxDistance = -1;
            int maxInd = -1;

            for(int i = 0; i < n-1; i++){
                double diff = arr[i+1]-arr[i];
                double sectionLength = diff / (double)(howMany[i]+1);
                if (sectionLength > maxDistance){
                    maxDistance = sectionLength;
                    maxInd = i;
                }
            }
            howMany[maxInd]++;
        }

        double maxAns = -1;
        for(int i = 0; i<n-1; i++){
            double diff = arr[i+1]-arr[i];
            double ans = diff / (double)(howMany[i]+1);
            if (ans > maxAns){
                maxAns = ans;
            }
        }
        return maxAns;
    }
    public static void main(String[] args){
        int[] arr = {1, 13, 17, 23, 32};
        int k = 4;
        double ans = minimiseMaxDistance1(arr, k);
        System.out.println(ans);
    }
}



