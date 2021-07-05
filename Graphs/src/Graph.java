import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
    private ArrayList<ArrayList<Integer>> mygraph = new ArrayList<ArrayList<Integer>>();

    public Graph(int nodes){
        for(int i=0;i<nodes;i++){
            mygraph.add(new ArrayList<Integer>());
            mygraph.get(i).add(i);
        }
    }

    public void addEdge(int source,int destination){
        mygraph.get(source).add(destination);
    }

    public void addVertex(){
        mygraph.add(new ArrayList<Integer>());
        mygraph.get(mygraph.size()-1).add(mygraph.size()-1);
    }

    public void printGraph(){
        for(List l : mygraph){
            System.out.print(l.get(0));
            for(int i=1;i<l.size();i++){
                System.out.print("->"+l.get(i));
            }
            System.out.println();
        }
    }

    public void getdfs(){
        List<Integer> visited = new ArrayList<Integer>();
        dfs(mygraph.get(0),visited);
    }

    public void dfs(ArrayList<Integer> node,List<Integer> visited){
        for(Integer l : node){
            if(!visited.contains(l)){
                visited.add(l);
                System.out.print(l+" ");
                dfs(mygraph.get(l),visited);
            }
        }
    }

   public void getbfs(){
        List<Integer> visited = new ArrayList<Integer>();
        Queue<Integer> Waiting = new PriorityQueue<>();
     //   Waiting.add(0);
        bfs(mygraph.get(0),Waiting,visited);
   }

   public void bfs(List<Integer> mylist,Queue<Integer> WaitingList,List visited){
        if(visited.contains(mylist.get(0))){
            return;
        }
        visited.add(mylist.get(0));
       System.out.print(mylist.get(0)+" ");
        for(int i=1;i<mylist.size();i++){
            if(!WaitingList.contains(mylist.get(i))){
                WaitingList.add(mylist.get(i));
            }

        }
        if(WaitingList.isEmpty()){
            return;
        }
       System.out.println(WaitingList.toString());
        bfs(mygraph.get(WaitingList.remove()),WaitingList,visited);
   }


}
