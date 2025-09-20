import java.util.PriorityQueue;

public class Minimize_Maximum_Distance_Between_Gas_Stations2{
    public static class Pair{
        double first;
        int second;

        Pair(double first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static double minimiseMaxDistance2(int[] arr, int k){
        int n = arr.length;
        int[] howMany = new int[n-1];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> Double.compare(b.first, a.first));

        for(int i = 0; i < n-1; i++){
            pq.add(new Pair(arr[i+1]-arr[i], i));
        }

        for(int gasStation = 0; gasStation < k; gasStation ++){
            Pair top = pq.poll();
            int secInd = top.second;

            howMany[secInd]++;

            double inidiff = arr[secInd+1] - arr[secInd];
            double newSectionLength = inidiff / (double)(howMany[secInd]+1);
            pq.add(new Pair(newSectionLength, secInd));
        }
        return pq.peek().first;
    }

    public static void main(String[] args){
        int[] arr = {1, 13, 17, 23, 32};
        int k = 4;
        double ans = minimiseMaxDistance2(arr, k);
        System.out.println(ans);
    }

}