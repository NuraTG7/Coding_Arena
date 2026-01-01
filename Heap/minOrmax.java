class minOrmax{
    static boolean isMaxHeap(int arr[], int n){
        for(int i = 0; i <= (n-2)/2; i++){
            if(2*i + 1 < n && arr[i] < arr[2*i + 1] ){
                return false;
            }
            if( 2*i + 2 < n && arr[i] < arr[2*i + 2] ){
                return false;
            }
        }
        return true;
    }

    static boolean isMinHeap(int arr[], int n){
        for(int i = 0; i <= (n-2)/2; i++){
            if(2*i + 1 < n && arr[i] > arr[2*i + 1] ){
                return false;
            }
            if( 2*i + 2 < n && arr[i] > arr[2*i + 2] ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 21, 23};
        int n = arr.length;

        boolean iskisk = isMaxHeap(arr, n) || isMinHeap(arr, n);
        System.out.println(iskisk);
    }
}