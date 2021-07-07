class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    destroy(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void destroy(char[][] grid,int i,int j){
        grid[i][j] = '0';
        if(0 <= i-1   && grid[i-1][j] == '1'){
            destroy(grid,i-1,j);
        }
        if(grid.length > i+1  && grid[i+1][j] == '1'){
            destroy(grid,i+1,j);
        }
        
        if( 0 <= j-1 && grid[i][j-1] == '1'){
            destroy(grid,i,j-1);
        }
        if(grid[i].length > j+1 && grid[i][j+1] == '1'){
            destroy(grid,i,j+1);
        }
        return;
    }
}
