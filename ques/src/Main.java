

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,4,1};
        int source_ind = 0;
        while (true){
            if(arr[source_ind] == source_ind+1){
                source_ind++;
            }else{
                int key = arr[source_ind];
                if(arr[key-1] == key){
                    System.out.print("the repeated number is "+key);
                    break;
                }else{
                    arr[source_ind] = arr[key-1];
                    arr[key-1] = key;
                }
            }
        }
    }

}
