class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int[][] data = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            int newmin = getmin(matrix,i,0,data);
            min = newmin < min ? newmin: min;
        }
        return min;
    }
    
    public int getmin(int[][] matrix,int pos,int level,int[][] data){
        if(data[level][pos] != 0){
            return data[level][pos];
        }
        int count1;
        int count2;
        int count3;
        if(pos == 0 && level < matrix.length - 1){
            count2 = matrix[level][pos] + getmin(matrix,pos,level+1,data);
            count3 = matrix[level][pos] + getmin(matrix,pos+1,level+1,data);
            data[level][pos] = Math.min(count2,count3);
            return data[level][pos];
        }else if(pos == matrix.length-1 && level < matrix.length -1){
            count1 = matrix[level][pos] + getmin(matrix,pos-1,level+1,data);
            count2 = matrix[level][pos] + getmin(matrix,pos,level+1,data);
            data[level][pos] = Math.min(count1,count2);
            return data[level][pos];
        }else if(level < matrix.length - 1){
            count1 = matrix[level][pos] + getmin(matrix,pos-1,level+1,data);
            count2 = matrix[level][pos] + getmin(matrix,pos,level+1,data);
            count3 = matrix[level][pos] + getmin(matrix,pos+1,level+1,data);
            int temp = Math.min(count1,count2);
            data[level][pos] = Math.min(temp,count3);
            return data[level][pos];
        }else{
            data[level][pos] = matrix[level][pos];
            return data[level][pos];
        }
        
    }
    
    
}
