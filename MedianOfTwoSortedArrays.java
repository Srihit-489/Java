class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalarray = new int[nums1.length+nums2.length];
        int runner1 = 0;
        int runner2 = 0;
        int runner = 0;
        while(!(runner1 == nums1.length&& runner2 == nums2.length)){
            int number1;
            int number2;
            
            if(runner1 != nums1.length){
                number1 = nums1[runner1];
            }else{
                number1 = Integer.MAX_VALUE;
            }
            
            
            if(runner2 != nums2.length){
                number2 = nums2[runner2];
            }else{
                number2 = Integer.MAX_VALUE;
            }
            
            if(number1 > number2){
                finalarray[runner] = number2;
                runner2 = runner2+1;
                runner = runner+1;
            }else{
                finalarray[runner] = number1;
                runner1 = runner1+1;
                runner = runner+1;
            }
        }
        
        if(finalarray.length%2 == 1){
            String result = "" + finalarray[(finalarray.length)/2];
            return Double.parseDouble(result);
        }else{
            String result = ""+ (finalarray[(finalarray.length-1)/2]+finalarray[(finalarray.length-1)/2+1]);
            double dresult = Double.parseDouble(result);
            return (dresult)/2;
        }
    }
}
