package genericspt2;

import java.util.HashMap;
import java.util.Map;

public class genq8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Populate the charFrequencyMap for str1
        for (char ch : str1.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        
        boolean isAnagram = true;
        for (char ch : str2.toCharArray()) {
            if (!charFrequencyMap.containsKey(ch) || charFrequencyMap.get(ch) == 0) {
                isAnagram = false;
                break;
            }
            charFrequencyMap.put(ch, charFrequencyMap.get(ch) - 1);
        }

        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
