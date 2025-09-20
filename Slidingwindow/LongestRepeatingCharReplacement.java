public class LongestRepeatingCharReplacement {

    // Brute force approach - O(n^2)
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int[] hash = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                hash[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);

                int changes = (j - i + 1) - maxFreq;

                if (changes <= k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }

    // Optimized sliding window approach - O(n)
    public static int characterReplacementII(String s, int k) {
        int left = 0;
        int maxLen = 0, maxFreq = 0;
        int[] hash = new int[26];

        for(int right = 0; right<s.length(); right++) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            // If the current window is invalid (more than k replacements needed)
            if ((right - left + 1) - maxFreq > k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // Main method to test
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println("Brute Force Output: " + characterReplacement(s, k));
        System.out.println("Sliding Window Output: " + characterReplacementII(s, k));
    }
}
