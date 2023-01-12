class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> x=new ArrayList<String>();
        generate(0,0,n,"",x);
        return x;
    }
   
    public static void generate(int open,int close,int n,String s,List<String> x)
    {
        if(close>open)
            return;
        if(open>n)
            return;
        if(close>n)
            return;
        if(open==n&&close==n)
        {
            //System.out.print(s+"  ");
            x.add(s);
            return;
        }
        generate(open+1,close,n,s+"(",x);
        generate(open,close+1,n,s+")",x);
    }
    
}