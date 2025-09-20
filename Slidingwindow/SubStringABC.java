import java.util.*;

class SubStringABC{
    public int subsetI(String s){
        int count = 0;
        HashSet<Character> mpp = new HashSet<>();

        for(int i = 0; i< s.length(); i++){
            mpp.clear();
            for(int j = i; j < s.length(); j++){
                mpp.add(s.charAt(j));
                if (mpp.size() == 3){
                    count += 1;
                }
            }
        }
        return count;
    }

    public int subsetII(String s){
        int count = 0;
        HashMap<Character, Integer> lastseen = new HashMap<>(Map.of('a', -1, 'b', -1, 'c', -1));

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(lastseen.containsKey(ch)){
                lastseen.put(ch, i);
            }
            if(lastseen.get('a') != -1 && lastseen.get('b') != -1 && lastseen.get('c') != -1 ){
                count = count + Math.min(lastseen.get('a'), Math.min(lastseen.get('b'), lastseen.get('c'))) + 1;
            }
        }
        return count;
    }


    public static void main(String[] args){
        SubStringABC check  = new SubStringABC();
        String s = "abcabc";
        System.out.println(check.subsetII(s));
    }
}