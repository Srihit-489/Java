class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] data = new boolean[n][n];
        for(int i=0;i<n;i++){
            data[i][i] = true;
        }
        String max = s.charAt(0)+"";
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                data[i][i+1] = true;
                if(max.length() < 2){
                max = s.substring(i,i+2);
                }
            }
  
        }
        for(int width = 2;width < s.length();width++){
            for(int i=0;i<n-width;i++){
                if(s.charAt(i) == s.charAt(i+width) && data[i+1][i+width-1]){
                   
                         data[i][i+width] = true;
                         if(width+1 > max.length()){
                         max = s.substring(i,i+width+1);
                         }
                    
                 }
        }
        }
        
        
        return max;
    }
}
