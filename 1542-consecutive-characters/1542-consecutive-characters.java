class Solution {
    public int maxPower(String s) {
        int i = 1;
        int result = 0;
        int count = 1;
        // "abbcccddddeeeeedcba"
        for( ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt( i -1 )){
                ++count;
            }else{
                result = Math.max(result , count);
                count = 1;
            }
        }
        return result !=0 ? result : count;
    }
}