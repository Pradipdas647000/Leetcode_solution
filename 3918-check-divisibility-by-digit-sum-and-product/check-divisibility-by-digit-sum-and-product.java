class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pd=1;
        int temp=n;
        while(temp!=0){
            int ld=temp%10;
            sum+=ld;
            pd*=ld;
            temp/=10;
        }
        int result=sum+pd;
        return n%result==0;
    }
}