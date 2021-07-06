class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0){
            return 0;
        }
        int[] data = new int[s.length()+1];
        data[0] = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                if(i == 0){
                    return 0;
                }else if(s.charAt(i-1) != '1' && s.charAt(i-1) != '2' ){
                    return 0;
                }else{
                    data[i+1] = data[i-1];
                }
            }else{
                if(i != 0 && (s.charAt(i-1) == '1' )){
                    data[i+1] = data[i] + data[i-1];
                }else if(i != 0 && (s.charAt(i-1) == '2' && s.charAt(i) <= '6')){
                    data[i+1] = data[i] + data[i-1];
                }else{
                    data[i+1] = data[i];
                }
            }
        }
        return data[s.length()];
    }
}
