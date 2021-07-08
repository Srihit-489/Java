class Solution {
    public boolean canFinish(int numCourses, int[][] arr) {
        HashMap<Integer,List<Integer>> myhash = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            myhash.put(i,new LinkedList());
        }
        for(int i=0;i<arr.length;i++){
            myhash.get(arr[i][0]).add(arr[i][1]);
        }
        int[] status = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(status[i] == 0 && !dfs(i,myhash,status)){
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int pos,HashMap<Integer,List<Integer>> myhash,int[] status){
        if(status[pos] == 1){
            return true;
        }
        
        if(status[pos] == -1){
            return false;
        }
        
        status[pos] = -1;
        for(int i : myhash.get(pos)){
            if(!dfs(i,myhash,status)){
                return false;
            }
        }
        status[pos] = 1;
        return true;
        
    }
    
    
}
