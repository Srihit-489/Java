public class Main {
    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {1,1,1,1,1},
                {1,2,0,1,1},
                {1,1,0,1,1},
                {1,1,0,0,0},
                {1,1,1,1,3}
        };
        mazerunner(maze,1,1);
    }

//    [
//            [1,1,1,1,1],
//            [1,2,0,1,1],
//            [1,1,0,1,1],
//            [1,1,0,0,0],
//            [1,1,1,1,3],
//            ]

    public static void mazerunner(int[][] maze,int x,int y){
        if(maze[x][y] == 3){
            System.out.println("Reached the end, the point is : "+x+","+y);
            return;
        }else{
            maze[x][y] = -1;
            if(x-1 >= 0 &&  maze[x-1][y] != 1 && maze[x-1][y] != -1){
                mazerunner(maze,x-1,y);
            }else if(x+1 < maze.length && maze[x+1][y] != 1 && maze[x+1][y] != -1){
                mazerunner(maze,x+1,y);
            }else if(y-1 >= 0 && maze[x][y-1] != 1 && maze[x][y-1] != -1){
                mazerunner(maze,x,y-1);
            }else if(y+1 < maze.length && maze[x][y+1] != 1 && maze[x][y+1] != -1){
                mazerunner(maze,x,y+1);
            }
            return;

        }

    }

}
