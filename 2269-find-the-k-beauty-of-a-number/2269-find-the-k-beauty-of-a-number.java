class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        int c=0;
        for(int i=0;i<=str.length()-k;i++)
        {
            int n=Integer.parseInt(str.substring(i,k+i));
            if(n!=0&&num%n==0)
                c++;
        }
        return c;
    }
}