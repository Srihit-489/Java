class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length() || !sContains(s,t)){
            return "";
        }
        int end=0;
        int start = 0;
        String max = s;
        for(end = t.length();end <= s.length();end++){
            String temp = s.substring(start,end);
            if(sContains(temp,t)){
                if(temp.length() < max.length()){
                    max = temp;
                }
                start++;
                end = end - 1;
            }
        }
        return max;
    }
    
    public boolean sContains(String mainstring,String substring){
        List<Character> mylist = new ArrayList<Character>();
        for(int i=0;i<substring.length();i++){
            mylist.add(substring.charAt(i));
        }
        for(int i=0;i<mainstring.length();i++){
            char temp = mainstring.charAt(i);
            if(mylist.contains(temp)){
                int index = mylist.indexOf(temp);
                mylist.remove(index);
            }
        }
        return mylist.size() == 0;
    }
    
}
