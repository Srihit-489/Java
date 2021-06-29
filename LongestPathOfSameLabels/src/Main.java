import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{1,1,1,2,2};
        int[] E = new int[]{1, 2, 1, 3, 2, 4, 2, 5};
        int[][] edgematrix = new int[A.length][A.length];
        for(int i=0;i<E.length-1;i++){
            int x = E[i];
            int y = E[i+1];
            edgematrix[x-1][y-1] = 1;
            edgematrix[y-1][x-1] = 1;
        }
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        getbfs(A,edgematrix,mylist);
        System.out.println(mylist);
    }

    public static void getbfs(int[] A,int[][] edgematrix,List<List<Integer>> mylist){
        List<Integer> currentlist = new ArrayList<Integer>();
        int i=0;
        int status = 0;
        int exitcode = 0;
        while(i<A.length){
            currentlist.add(i+1);
            int j=0;
            while(j< edgematrix[i].length){
                if(edgematrix[i][j] == 1){
                    if(A[i] == A[j]){
                        edgematrix[i][j] = 0;
                        edgematrix[j][i] = 0;
                        removeedge(edgematrix,i);
                        i = j;
                        exitcode = 1;
                        break;
                    }
                }
                j++;
            }
            if(exitcode == 1){
                exitcode = 0;
            }else{
                List<Integer> newlist = new ArrayList<Integer>(currentlist);
                mylist.add(newlist);
                currentlist.clear();
                status++;
                i = status;
            }

        }

    }

    public static void removeedge(int[][] edgematrix,int num){
        for(int i=0;i<edgematrix.length;i++){
            edgematrix[i][num] = 0;
        }
    }
}
