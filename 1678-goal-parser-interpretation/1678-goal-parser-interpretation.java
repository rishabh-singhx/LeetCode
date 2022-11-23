class Solution {
    public String interpret(String command) {
        int i;
        char c;
        String s="";
        for(i=0;i<command.length();i++){
            c=command.charAt(i);
            if(c=='G')
                s=s+"G";
            else if(c=='(')
            {
                char d=command.charAt(i+1);
                if(d==')')
                    s=s+"o";
                else
                    s=s+"al";
            }
        }
        return s;
    }
}