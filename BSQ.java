class Solution {
    public LLNode solve(LLNode node) {
      HashMap<Integer,LLNode> myhash = new HashMap<Integer,LLNode>();
      LLNode itr = node;
      Integer count = 0;
      while(itr != null){
          myhash.put(count,itr);
          count = count + 1;
          itr = itr.next;
      }
      LLNode result = new LLNode(0);
      LLNode itr2 = result;
      int n = 1;
      Integer count2 = 0;
      int length = count;
      while(count2 < count){
          if(n%2 == 1){
              itr2.next = myhash.get(count-1);
            //  System.out.println(myhash.get(count).val);
              itr2 = itr2.next;
            count = count - 1;
            n = n + 1;
          }else{
              itr2.next = myhash.get(count2);
              count2++;
              itr2 = itr2.next;
              n = n + 1;
          }
      }
      itr2.next = null;
      return result.next;
    }
}
