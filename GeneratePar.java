class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> mylist = new ArrayList<>();
        getpar(mylist,"",n,0,0);
        return mylist;
    }
    
    public void getpar(List<String> mylist,String current,int n,int right,int up){
        if(right == n && up == n){
            mylist.add(current);
            return;
        }
        
        if(up == right && right < n){
            getpar(mylist,current+'(',n,right+1,up);
        }else if(up < right && right < n){
            getpar(mylist,current+'(',n,right+1,up);
            getpar(mylist,current+')',n,right,up+1);
        }else if(up < right && right == n){
             getpar(mylist,current+')',n,right,up+1);
        }
        
        
    }
}
