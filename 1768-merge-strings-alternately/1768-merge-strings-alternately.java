class Solution {
    public String mergeAlternately(String word1, String word2) {
       String ns="";
       int mini=Math.min(word1.length(),word2.length());
       for(int i=0;i<mini;i++){
        ns=ns+word1.charAt(i)+word2.charAt(i);
       } 
       ns=ns+word1.substring(mini,word1.length());
       ns=ns+word2.substring(mini,word2.length());
       return ns;
    }
}