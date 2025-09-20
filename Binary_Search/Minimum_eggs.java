class Minimum_eggs{
    public static void main(String[] args){
        int floors = 100, strong = 67;
        int low = 0, high = floors;

        int cnt = 0;
        while(low <= high)   {
            int mid = (low +high)/2;
            cnt += 1;
            System.out.println(mid);
            if(mid == strong){
                System.out.println(cnt);
                break;
            }

            if(mid > strong){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
    }
}

