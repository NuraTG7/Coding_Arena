import java.util.*;
public class reversePairs{
    public static void main(String[] args){
        int[] arr = {40, 25, 19, 12, 9, 6, 2};
        int cnt = 0;

        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]*2){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}