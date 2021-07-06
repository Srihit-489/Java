class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<String>();
        }
        char[] list2 = new char[]{'a','b','c'};
        char[] list3 = new char[]{'d','e','f'};
        char[] list4 = new char[]{'g','h','i'};
        char[] list5 = new char[]{'j','k','l'};
        char[] list6 = new char[]{'m','n','o'};
        char[] list7 = new char[]{'p','q','r','s'};
        char[] list8 = new char[]{'t','u','v'};
        char[] list9 = new char[]{'w','x','y','z'};
        HashMap<Character,char[]> myhash = new HashMap<>();
        myhash.put('2',list2);
        myhash.put('3',list3);
        myhash.put('4',list4);
        myhash.put('5',list5);
        myhash.put('6',list6);
        myhash.put('7',list7);
        myhash.put('8',list8);
        myhash.put('9',list9);
        List<String> mylist = new ArrayList<String>();
        getpermute(digits,"",mylist,myhash);
        return mylist;
    }
    
    public void getpermute(String digits,String current,List<String> mylist,HashMap<Character,char[]> myhash){
        if(digits.length() == 0){
            mylist.add(current);
            return;
        }
        char temp = digits.charAt(0);
        char[] myarray = myhash.get(temp);
        for(int i=0;i<myarray.length;i++){
            getpermute(digits.substring(1),current+myarray[i],mylist,myhash);
        }
    }
}
