import java.util.HashMap;

class LongSubswithKint{
    public int longSubs(String st, int k){
        HashMap<Character, Integer> mpp = new HashMap<>();

        int maxlen = 0;
        for(int i =0; i < st.length(); i++){
            mpp.clear();
            for(int j = i; j < st.length(); j ++){
                mpp.put(st.charAt(j), mpp.getOrDefault(st.charAt(j), 0)+1);

                if (mpp.size() <= k){
                    maxlen = Math.max(maxlen, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxlen;
    }

    public int longSubsII(String s, int k){
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxlen = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0)+1);
            if (mpp.size() > k){
                mpp.put(s.charAt(l), mpp.getOrDefault(s.charAt(l), 0)-1);
                if(mpp.get(s.charAt(l))==0){
                    mpp.remove(s.charAt(l));
                }
                l ++;
            }            
            if(mpp.size() <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
        }
        return maxlen;
    }




    public static void main(String[] args){
        LongSubswithKint obj = new LongSubswithKint();
        String s = "abcba";
        int k = 2;
        System.out.println("Longest substring length: " + obj.longSubsII(s, k));
    }
}