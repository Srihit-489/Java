class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[][] noRepArray = new int[s.length()+1][s.length()+1];
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                    if(isRep(s,noRepArray,i,j)){
                        max = max<j-i?j-i:max;
                    }
            }
        }
        return max;
    }
    
    public boolean isRep(String mystring,int[][] noRepArray,int start,int end){
        if(mystring.substring(start,end).length() == 1){
            noRepArray[start][end] = 1;
            return true;
        }
        if(isRep(mystring,noRepArray,start,end-1) && notIn(mystring.substring(start,end-1),mystring.charAt(end-1))){
            noRepArray[start][end] = 1;
            return true;
        }else{
            noRepArray[start][end] = 0;
            return false;
        }
    }
    
    public boolean notIn(String thisstring,char ch){
        for(int i=0;i<thisstring.length();i++){
            if(thisstring.charAt(i) == ch){
                return false;
            }
        }
        return true;
    }
    
}
