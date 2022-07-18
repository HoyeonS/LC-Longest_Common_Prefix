class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].equals(""))
            return "";
        char first_letter = strs[0].charAt(0);
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].equals(""))
                return "";
            if(first_letter != strs[i].charAt(0))
                return "";
            strs[i] = strs[i].substring(1);
        }
        return first_letter + longestCommonPrefix(strs);
    }
}