class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int prr[]=new int[26];
       int srr[]=new int[26];
       for(char ch:p.toCharArray())
       {
        prr[ch-97]++;
       } 
       int k=Math.min(p.length(),s.length());
       for(int i=0;i<k;i++)
       {
        srr[s.charAt(i)-97]++;
       }
       List<Integer> ans=new ArrayList<>();
       boolean flag=true;
       for(char ch:p.toCharArray())
       {
        if(prr[ch-97]!=srr[ch-97])
        {
            flag=false;
        }
       }
       if(flag)
       {
        ans.add(0);
       }
       for(int i=0;i<s.length()-k;i++)
       {
        srr[s.charAt(i)-97]--;
        srr[s.charAt(i+k)-97]++;
        if(Arrays.equals(srr,prr))
        {
            ans.add(i+1);
        }
       }
       return ans;
    }
}