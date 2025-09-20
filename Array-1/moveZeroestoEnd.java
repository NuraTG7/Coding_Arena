public class moveZeroestoEnd{
    public static void main(String[] args){
        int[] arr = {1, 0, 1, 0, 0, 1, 0, 1, 1};

        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;                
            }
        }
        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                j++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}