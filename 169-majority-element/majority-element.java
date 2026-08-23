class Solution {
    public int majorityElement(int[] nums) {
        int maxcount=0;
        int result=0;
       
        for(int i=0;i<nums.length;i++){
             int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;

                }
            }
            if(count>maxcount){
                maxcount=count;
                result=nums[i];
            }
        }
        return result;
    }
}