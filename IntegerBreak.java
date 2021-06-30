class Solution {
    public int integerBreak(int n) {
        int[] breakarray = new int[n+1];
        int highest = gethighestbybreaking(n,breakarray);
        return highest;
    }
    
    public int gethighestbybreaking(int n,int[] breakarray){
        if(n == 1){
            return 1;
        }else if(breakarray[n] != 0){
            return breakarray[n];
        }else{
            int highest = 0;
            for(int i=1;i<n;i++){
                highest = Math.max(highest,i*gethighof(n-i,breakarray));
            }
            breakarray[n] = highest;
            return highest;
        }
    }
    
    public int gethighof(int n,int[] breakarray){
        return Math.max(n,gethighestbybreaking(n,breakarray));
    }
}
