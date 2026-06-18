class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0,j=people.length-1;
        while(i<=j)
        {
            if(i==j && people[i]<=limit)
            {
                count++;
                break;
            }
            else if(people[i]+people[j]>limit)
            {
                j--;
                count++;
            }
            else
            {
                i++;
                j--;
                count++;
            }
        }
        return count;
    }
}