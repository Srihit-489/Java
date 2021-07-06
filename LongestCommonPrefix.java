class Solution {
    public String longestCommonPrefix(String[] strs) {
        String finalstring = "";
        String reference = strs[0];
        int count = 0;
        
        while(count != reference.length()){
            char temp = reference.charAt(count);
            for(int i=1;i<strs.length;i++){
                if( strs[i].length() <= count || temp != strs[i].charAt(count)){
                    return finalstring;
                }
            }
            finalstring = finalstring+temp;
            count++;
        }
        return finalstring;
    }
}
