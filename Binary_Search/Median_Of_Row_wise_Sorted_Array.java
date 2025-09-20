    class Median_Of_Row_wise_Sorted_Array{
        static int upperBound(int[] arr,int x, int n){
            int low= 0, high =  n-1;
            int ans = n;

            while(low <= high){
                int mid = (low+high)/2;

                if(arr[mid] > x){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return ans;
        }

        static int countSmallEqual(int[][] arr, int m, int n, int mid){
            int cnt = 0;
            for(int i = 0; i<m; i++){
                cnt += upperBound(arr[i], mid, n);
            }
            return cnt;
        }

        static int median(int[][] arr, int m, int n){
            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            for(int i = 0; i < m; i++){
                low = Math.min(low, arr[i][0]);
                high = Math.max(high, arr[i][n-1]);
            }

            int req = (m*n)/2;
            while(low <= high){
                int mid = (low + high) / 2;
                int smallEqual = countSmallEqual(arr, m, n, mid);

                if(smallEqual <= req){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return low;
        }

        public static void main(String[] args){
            int[][] arr = {{1, 3, 8}, {2, 3, 4}, {1, 2, 5}};
            int m = arr.length;
            int n = arr[0].length;
            int ans = median(arr, m, n);
            System.out.print(ans);
        }
    }