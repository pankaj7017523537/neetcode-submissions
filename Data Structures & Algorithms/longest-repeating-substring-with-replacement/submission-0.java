class Solution {
    public int characterReplacement(String s, int k) {
        s = s.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Highest frequency character in current window
            maxFreq = Math.max(maxFreq, map.get(ch));

            // Characters that need to be replaced
            int replacements = (right - left + 1) - maxFreq;

            // If replacements > k, shrink window
            while (replacements > k) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

                replacements = (right - left + 1) - maxFreq;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}