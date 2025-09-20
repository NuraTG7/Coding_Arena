class AggressiveCows{
    public static boolean canWeplace(int[] stalls, int dist, int cows){
        int cntRows= 1, last = stalls[0];

        for(int i = 0; i < stalls.length; i++){
            if(stalls[i]-last >= dist){
                cntRows ++;
                last = stalls[i];
            }
            if(cntRows >= cows){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4, n = stalls.length;
        int low = 1, high = stalls[n-1]-stalls[0];
        
        while(low < high){
            int mid= (low + high)/2;
            if(canWeplace(stalls, mid, k)){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(high);
    }
}