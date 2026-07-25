class Solution {
    public int reverse(int x) {
        int rev=0;
        int max=Integer.MAX_VALUE;
        int small=Integer.MIN_VALUE;

        while(x!=0){
            int ld=x%10;
            x/=10;
        

         if(rev>max/10 || rev<small/10){
            return 0;
        }

        if((rev==max && ld>7) || (rev==small && ld<-8)){
            return 0;
        }
        rev=rev*10+ld;
        }
        return rev;
    }
}