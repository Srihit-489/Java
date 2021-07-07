class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] data = new int[nums.length];
        data[0] = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
            data[i] = 1 + getprevdata(nums,i,data);
            max = max < data[i]?data[i]:max; 
        }
       
        return max;
    }
    
    public int getprevdata(int[] nums,int end,int[] data){
        int retdata = 0;
        for(int i=0;i<end;i++){
            if(nums[i] < nums[end] && data[i] > retdata){
                retdata = data[i];
            }
        }
        return retdata;
    }
    
}
