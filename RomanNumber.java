class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> myhash = new HashMap<>();
        myhash.put(0,"");
        
        myhash.put(1,"I");
        myhash.put(5,"V");
        myhash.put(10,"X");
        myhash.put(50,"L");
        myhash.put(100,"C");
        myhash.put(500,"D");
        myhash.put(1000,"M");
        
        myhash.put(4,"IV");
        myhash.put(9,"IX");
        myhash.put(40,"XL");
        myhash.put(90,"XC");
        myhash.put(400,"CD");
        myhash.put(900,"CM");

        int input = num;
        int c1 = input/1000;
        input = input%1000;
        int c2 = input/500;
        input = input%500;
        int c3 = input/100;
        input = input%100;
        int c4 = input/50;
        input = input%50;
        int c5 = input/10;
        input = input%10;
        int c6 = input/5;
        input = input%5;
        int c7 = input;
        
        String temp1 =getString(c2,myhash.get(500))
            +(c3 == 4 ? myhash.get(400):getString(c3,myhash.get(100)));
        
        
        String temp2 =getString(c4,myhash.get(50)) 
            + (c5 == 4? myhash.get(40):getString(c5,myhash.get(10)));
        
        
        String temp3 = getString(c6,myhash.get(5))+(c7 == 4 ? myhash.get(4):getString(c7,myhash.get(1)));
        
        String finalstring =
            getString(c1,myhash.get(1000))
            +(c2 == 1 && c3 == 4? myhash.get(900):temp1)
            +(c4 == 1 && c5 == 4? myhash.get(90):temp2)
            + (c6 == 1 && c7 == 4 ? myhash.get(9):temp3);
        
        return finalstring;
        
    }
    
    public String getString(int num,String mystring){
        if(num == 0){
            return "";
        }else{
            return mystring+getString(num-1,mystring);
        }
    }
}
