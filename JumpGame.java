class Solution {
    public int jump(int[] nums) {
    int level = 0;
    int CurrentLongest = 0;
    int max = 0;
    for(int i=0; i<nums.length-1; i++) {
        max = Math.max(max, i+nums[i]);
        if( i == CurrentLongest ) {
            level++;
            CurrentLongest = max;
        } 
    }
    return level;
    }
    
 
}
