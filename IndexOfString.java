class IndexOfString {
    public int strStr(String haystack, String needle) {
        // Get the lengths of haystack and needle
        int haystackLength = haystack.length();
        int needleLength = needle.length(); 

        // Return 0 if needle is empty
        if (needleLength == 0) {
            return 0;
        }

        // Loop through the haystack
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        // Return -1 if needle is not found
        return -1;
    }
}
