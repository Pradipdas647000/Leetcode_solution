class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }
        int rev=0;
        int num=x;
        while(x>0){
            int ld=x%10;
            rev=rev*10+ld;
            x/=10;
            
        }
        if(rev==num){
            return true;
        }else
        return false;
    }
}