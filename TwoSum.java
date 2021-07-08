class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> myhash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(myhash.containsKey(target - nums[i])){
                return new int[]{i,myhash.get(target - nums[i])};
            }
            myhash.put(nums[i],i);
        }
        return new int[]{};
    }
}
