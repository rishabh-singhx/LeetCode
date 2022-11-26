class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        String arr[]=str.split("");
        int c=0;
        String s="";
        for(int i=0;i<k;i++)
        {
            s=s+arr[i];
        }
        int n=Integer.parseInt(s);
        if(n!=0&&num%n==0)
            c++;
        for(int i=k;i<arr.length;i++)
        {
            s=s.substring(1)+arr[i];
            n=Integer.parseInt(s);
            if(n!=0&&num%n==0)
                c++;
        }
        return c;
    }
}