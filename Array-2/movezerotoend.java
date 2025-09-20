// enga akka oralavuku mendal

public class movezerotoend{
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 1, 0};
        int i = 0, j = 0;

        while(i < arr.length){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }

        for(int v = 0; v < arr.length; v++){
            System.out.print(arr[v] + " ");
        }
    }
}