public class twoSumSorted {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int n = arr.length;
        int l = 0, r = n-1;

        while(l<r){
            if(arr[l] + arr[r] == target){
                System.out.println(l+" "+r);
                break;
            }
            else if(arr[l] + arr[r] < target){
                l++;
            }
            else{
                r--;
            }
        }
    }
}