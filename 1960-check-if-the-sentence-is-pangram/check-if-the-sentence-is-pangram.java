class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<sentence.length();i++){
                if(ch==sentence.charAt(i)){
                    count++;
                    break;
                }
            }
    }
    if(count==26){
        return true;
    }

    return false;
}
}