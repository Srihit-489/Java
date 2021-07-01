class Solution {
    public String convert(String s, int numRows) {
        List[] stringlist = new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            stringlist[i] = new ArrayList();
        }
        int i=0;
        while(i != s.length()){
            int phase1 = 0;
            while(phase1 < numRows && i != s.length()){
                stringlist[phase1].add(s.charAt(i));
                phase1++;
                i++;
            }
            int phase2 = numRows-2;
            while(phase2 > 0 && i != s.length()){
                stringlist[phase2].add(s.charAt(i));
                phase2--;
                i++;
            }
        }
        String retstring = "";
        for(int j=0;j<stringlist.length;j++){
            for(int k=0;k<stringlist[j].size();k++){
                retstring = retstring+stringlist[j].get(k);
            }
        }
        return retstring;
    }
}
