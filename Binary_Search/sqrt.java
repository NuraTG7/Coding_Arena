class sqrt{
    int number(int num){
        int low = 1, high = num, ans = 1; 
        while(low <= high){
            int mid = (low + high)/2;
            if(mid * mid > num){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }

    public static  void main(String[] args){
        sqrt obj = new sqrt();
        System.out.println(obj.number(36));
    }
}
