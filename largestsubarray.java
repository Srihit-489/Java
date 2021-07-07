class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempsum = 0;
        for(int i=0;i<nums.length;i++){
            tempsum = tempsum + nums[i];
            if(tempsum > max){
                max = tempsum;
            }
            if(tempsum < 0){
                tempsum = 0;
            }
        }
        return max;
    }
}
