import java.util.*;
class LongestConsecutiveSequence{
    public static int LongestConsecutive(int[] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }

        int longestStreak = 0;
        for(int num:nums){
            if(hashSet.contains(num)){
                int currentNum = num;
                int currentStreak = 1;

                while(hashSet.contains(currentNum-1)){
                    currentNum-=1;
                    currentStreak+=1;
                }
                System.out.print(currentStreak);
                longestStreak = Math.max(longestStreak, currentStreak);
                
            }
        }
        return longestStreak;
    }

    public static void main(String[] args){
        int[] nums = {1, 3, 100, 4, 2, 99, 101};
        System.out.print(LongestConsecutive(nums));
    }
}