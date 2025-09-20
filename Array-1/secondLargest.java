public class secondLargest{
    public static void main(String[] args){
        int[] arr = {5, 5, 10, 10, 8};
        int largest = arr[0], secondLargest = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        System.out.print(secondLargest);
    }
}