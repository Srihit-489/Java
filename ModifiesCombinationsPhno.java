class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        List<String> mystringlist = new ArrayList<>();
        String[] possibilities = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        getdfs(digits,0,new StringBuilder(),possibilities,mystringlist);
        return mystringlist;
    }
    
    public void getdfs(String digits,int index,StringBuilder currentstring,String[] possibilities,List<String> mylist){
        if(index == digits.length()){
            mylist.add(currentstring.toString());
            return;
        }
        String mystring = possibilities[Character.getNumericValue(digits.charAt(index))];
        for(int i=0;i<mystring.length();i++){
            char temp = mystring.charAt(i);
            getdfs(digits,index+1,currentstring.append(temp),possibilities,mylist);
            currentstring.deleteCharAt(currentstring.length()-1);
        }
    }
}
