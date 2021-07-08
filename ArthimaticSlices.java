class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        if(arr.length < 3){
            return 0;
        }
         int[] data = new int[arr.length];
         data[0] = 0;
         data[1] = 0;
         int track = 2;
         int dif = arr[1] - arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i] - arr[i-1] == dif){
                track++;
                data[i] = track + data[i-1]-2;
               
            }else{
                track = 2;
                dif = arr[i]-arr[i-1];
                data[i] = data[i-1];
            }
        }
        return data[arr.length-1];
    }
}
