import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words1 = new String[]{"great","acting","skills"};
        String[] words2 = new String[]{"fine","drama","talent"};
        HashMap<String,Boolean> visited = new HashMap<>();
        String[][] pairs  = new String[][]{{"great","good"},{"fine","good"},{"acting","drama"},{"skills","talnet"}};
        HashMap<String, List<String>> graph = new HashMap<>();

        for(int i=0;i< words1.length;i++){
            visited.put(words1[i],false);
            graph.put(words1[i],new ArrayList<>());
        }

        for(int j=0;j< words2.length;j++){
            if(visited.keySet().contains(words2[j])){
                visited.put(words2[j],true);
            }else{
                graph.put(words2[j],new ArrayList<>());
                visited.put(words2[j],false);
            }
        }

        for(int i=0;i< pairs.length;i++){
            if(!graph.keySet().contains(pairs[i][0])){
                graph.put(pairs[i][0],new ArrayList<>());
            }

            if(!graph.keySet().contains(pairs[i][1])){
                graph.put(pairs[i][1],new ArrayList<>());
            }
            visited.put(pairs[i][0],true);
            visited.put(pairs[i][1],true);
//            graph.get(pairs[i][0]).add(pairs[i][1]);
//            graph.get(pairs[i][1]).add(pairs[i][0]);

        }

        System.out.println("The both sentances are match : "+!visited.entrySet().contains(false));


    }


}
