import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = new int[][]{{0,1},{1,2},{2,0},{3,4}};
        HashMap<Integer, List<Integer>> myhash = new HashMap<>();
        for(int i=0;i<n;i++){
            myhash.put(i,new LinkedList<>());
        }

        for(int i=0;i< edges.length;i++){
            myhash.get(edges[i][0]).add(edges[i][1]);
            myhash.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];

        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(myhash,visited,i);
            }
        }

        System.out.println(count);
    }

    public static void dfs(HashMap<Integer,List<Integer>> myhash,boolean[] visited,int pos){
        visited[pos] = true;

        for(int i : myhash.get(pos)){
            if(!visited[i]){
                dfs(myhash,visited,i);
            }
        }

    }

}
