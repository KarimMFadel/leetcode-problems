package HashMapDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Set<Character> ranNoteSet = new HashSet<>();
        Map<Character, Integer> magSet = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            // if(magSet.containsKey(c)) {
            //     magSet.replace(c, magSet.get(c) + 1);
            // } else {
            //     magSet.put(c, 1);
            // }
            int currentCount = magSet.getOrDefault(c, 0);
            magSet.put(c, currentCount + 1);
        }
        for(char c : ransomNote.toCharArray()) {
            // if(!magSet.containsKey(c)) {
            //     return false;
            // }
            // if(magSet.get(c) > 1)
            //     magSet.replace(c, magSet.get(c) - 1);
            // else
            //     magSet.remove(c);

            int currentCount = magSet.getOrDefault(c, 0);
            if(currentCount == 0)
                return false;
            magSet.put(c, currentCount - 1);
        }
        return true;
    }
}
