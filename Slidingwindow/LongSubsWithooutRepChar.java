import java.util.*;

public class LongSubsWithooutRepChar{
    public static void main(String[] args){
        String s = "abcaabcdba";

        int l = 0, maxi = 0;
        Set<Character> mpp = new HashSet<Character>();

        for(int r = 0; r < s.length(); r++){
            while(mpp.contains(s.charAt(r))){
                mpp.remove(s.charAt(l));
                l++;
            }
            mpp.add(s.charAt(r));
            maxi = Math.max(maxi, r-l+1);
        }

        System.out.print(maxi);
    }
}