class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        for(int ele:nums2)
        {
            if(hm.containsKey(ele) && hm.get(ele)>=1)
            {
            al.add(ele);
            hm.put(ele,hm.get(ele)-1);
            }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}