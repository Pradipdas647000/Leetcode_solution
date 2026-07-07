class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int place=1;
        int result=0;
        while(n!=0){
            int ld=n%10;
            
            if(ld!=0){
                result=ld*place+result;
                place*=10;
                sum+=ld;
            }
            n/=10;
            
        }
        return (long)result*sum;
    }
}