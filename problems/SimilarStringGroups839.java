package problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarStringGroups839 {
    public static void main(String[] args) {
        String[] strs = {"tars","rats","arts","star"};
        System.out.println(numSimilarGroups(strs));
        String[] strs2 = {"omv","ovm"};
        System.out.println(numSimilarGroups(strs2));
        String[] strs3 = {"blw","bwl","wlb"};
        System.out.println(numSimilarGroups(strs3));
    }

    public static int numSimilarGroups(String[] strs) {
        // get ascii of each word and store in map<ascii, list<string>>
      //  Map<Long, List<String>> store = storeAnagramTogethor(strs);
       
        // iterate on each element on map
        //      iterate on list<string>
        
            int count = 0;
            for (int i = 0; i < strs.length; i++) {
                for (int j = i+1; j < strs.length; j++) {
                    if(isSimilar(strs[i], strs[j])) {
                        count++;
                        System.out.println("isSimilar - count " + count + " / " + strs[i] + " - "+ strs[j]);
                        
                    }
                }
            }
           
        return count;
    }

    // https://leetcode.com/problems/similar-string-groups/
    public static int numSimilarGroupsxxxx(String[] strs) {
        // get ascii of each word and store in map<ascii, list<string>>
        Map<Long, List<String>> store = storeAnagramTogethor(strs);
       
        // iterate on each element on map
        //      iterate on list<string>
        int maxCount = 0;
        for (Map.Entry<Long, List<String>> entry : store.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
           // int[] repeated = new int[entry.getValue().size()];
            int count = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                for (int j = i+1; j < entry.getValue().size(); j++) {
                    if(isSimilar(entry.getValue().get(i), entry.getValue().get(j))) {
                        count++;
                        System.out.println("isSimilar - count " + count + " / " + entry.getValue().get(i) + " - "+ entry.getValue().get(j));
                        
                    }
                }
               // repeated[i] = count+1;
            }
            if(count > maxCount)
                maxCount = count;
        }
        return maxCount;
    }

    private static int getMax(int[] repeated) {
        int max = repeated[0];  
        //Loop through the array  
        for (int i = 0; i < repeated.length; i++) {  
            //Compare elements of array with max  
           if(repeated[i] > max)  
               max = repeated[i];  
        }  
        return max;
    }

    private static Map<Long, List<String>> storeAnagramTogethor(String[] strs) {
        Map<Long, List<String>> store = new HashMap<>(); 
        for (String str : strs) {
            long asciiValue = getAsciiOfString(str);
            if(store.containsKey(asciiValue)) {
                store.get(asciiValue).add(str);
            } else {
                List<String> samilerString = new ArrayList<>();
                samilerString.add(str);
                store.put(asciiValue, samilerString);
            }
        }
        return store;
    }

    private static int getAsciiOfString(String str) {
        int sum=0;
        for(int i=0; i<str.length(); i++) {
            int asciiValue = str.charAt(i);
            sum = sum+ asciiValue;
        }
        return sum;
    }

    
    private static boolean isSimilar(String firstStr, String secondStr) {
        int diff = 0;
        for(int i = 0; i < firstStr.length(); i++) {
            if(firstStr.charAt(i) != secondStr.charAt(i)) // if at any 'i', chars mismatch, then add diff
                diff++;
        }
        
        return (diff == 2 || diff == 0) ; // similar only when 2 diff (so that we can do 1 swap) OR there's no diff
    }
    
}
