package twopointer;

public class FindtheIndexoftheFirstOccurrenceinaString28 {
    public int strStr(String haystack, String needle) {

        if (!haystack.contains(needle)) return -1;
        return haystack.indexOf(needle);
    }
}
