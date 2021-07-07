class Solution {
    public int climbStairs(int n) {
        int[] data = new int[n+1];
        data[0] = 1;
        data[1] = 1;
        return nthstair(n,data);
    }
    
    public int nthstair(int n,int[] data){
        if(data[n] != 0){
            return data[n];
        }
        data[n] = nthstair(n-1,data) + nthstair(n-2,data);
        return data[n];
    }
}
