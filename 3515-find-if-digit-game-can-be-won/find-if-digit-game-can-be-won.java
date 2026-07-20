class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigitsum=0;
        int doubledigitsum=0;
        for(int num:nums){
            if(num<=9){
                singledigitsum+=num;
            }
           else if(num>=10){
            doubledigitsum+=num;
           }
        }
        if(singledigitsum>doubledigitsum || singledigitsum<doubledigitsum ){
            return true;
        }else{
            return false;
        }
        
    }
}