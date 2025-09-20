import java.util.*;

public class findDuplicate{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6};
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            if(temp.contains(nums[i])){
                System.out.println(nums[i]);
            }
            else{
                temp.add(nums[i]);
            }
        }
    }
}