public class removeDuplicates{
    public static void main(String[]  arggs){
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3};

        int i= 0, v = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] =  arr[j];
                i++;
            }
            v = i;
        }

        for(int j = 0; j <= v; j++){
            System.out.print(arr[j]);
        }
    }
}