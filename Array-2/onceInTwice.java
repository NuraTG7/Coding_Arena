// priya kooda loosu thaa

public class onceInTwice{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 2, 4, 4};

        int move = 0;
        for(int i = 0; i < nums.length; i++){
            move = move ^ nums[i];
        }

        System.out.println(move);
    }
}