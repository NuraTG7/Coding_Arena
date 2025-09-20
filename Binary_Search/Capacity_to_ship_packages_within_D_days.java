class Capacity_to_ship_packages_within_D_days{
    public static int findDays(int[] weights, int cap){
        int days = 1, load = 0;
        for(int num :weights){
            if(load + num > cap){
                days += 1;
                load = num;
            }
            else{
                load += num;
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights,int d){
        int low = Integer.MIN_VALUE, high = 0;
        for(int num : weights){
            high += num;
            low = Math.max(low, num);
        }

        while(low <= high){
            int mid = (low +high) / 2;
            int ans = findDays(weights, mid);
            if(ans <= d){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println(ans);
    }
}