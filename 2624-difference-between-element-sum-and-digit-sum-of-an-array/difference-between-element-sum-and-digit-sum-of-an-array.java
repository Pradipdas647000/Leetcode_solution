class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum =0;
        int digitsum=0;
        for(int num:nums){
           elementsum+=num;
           while(num!=0){
            int ld=num%10;
            digitsum+=ld;
            num/=10;
           }
           
        }
        return elementsum-digitsum;


    }
}