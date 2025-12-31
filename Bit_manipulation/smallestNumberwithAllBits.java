class Solution {
    public int smallestNumber(int n) {
        int cnt = 0, k = 1;
        while(n >= k){
            k*=2;
            cnt += 1;
        }
        return((int)Math.pow(2, cnt)-1);
    }
}