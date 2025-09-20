//n = 3 m = 27  
// root(27, 3) = 3

class Nth_Root_Of_A_Number{
    int power(int mid, int n, int m){
        long ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans * mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }

    int Nth_Root(int n, int m){
        int low = 1, high = m;
        while(low <= high){
            int mid = (high + low) / 2;
            int midN = power(mid, n, m);

            if(midN == 1) return mid;
            else if(midN == 0){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Nth_Root_Of_A_Number obj = new Nth_Root_Of_A_Number();
        int n = 3, m = 27;
        System.out.println(obj.Nth_Root(n, m));
    }
}