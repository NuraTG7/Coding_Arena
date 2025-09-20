
class Solution {
    public static String maxWindow(String s, String t) {
        int minlen = Integer.MAX_VALUE;
        int sindex = 0;
        int n = s.length();
        int m = t.length();

        for (int i = 0; i <= n - m; i++) {
            int[] hash = new int[128]; // Use full ASCII size to avoid index issues
            int cnt = 0;

            for (int j = 0; j < m; j++) {
                hash[t.charAt(j)]++;
            }

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] > 0) {
                    cnt++;
                }
                hash[s.charAt(j)]--;

                if (cnt == m) {
                    if ((j - i + 1) < minlen) {
                        minlen = j - i + 1;
                        sindex = i;
                    }
                    System.out.println(s.substring(sindex, sindex + minlen));
                    break; // stop expanding this window, go to next i
                }
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(sindex, sindex + minlen);
    }

    public static String maxWindowII(String s, String t){
        int minlen = Integer.MAX_VALUE;
        int sindex = 0;
        int n = s.length();
        int m = t.length();
        int[] hash = new int[256];
        int cnt = 0;
        int l = 0;

        for(int i = 0; i < m; i++){
            hash[t.charAt(i)]++;
        }

        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            hash[ch]--;

            if (hash[ch] >= 0) {
                cnt++;
            }

            while(cnt == m){
                if(r - l + 1 < minlen){
                    minlen = r - l + 1;
                    sindex = l;
                }
                System.out.println(s.substring(l, r+1));

                char leftChar = s.charAt(l);
                hash[leftChar]++;
                if (hash[leftChar] > 0) {
                    cnt--;
                }
                l++;
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(sindex, sindex + minlen);
    }


    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";

        String result = maxWindowII(s, t);
        System.out.println("Minimum window containing all characters: " + result);
    }
}
