class Solution {
    public int romanToInt(String s) {
     int i,l,sum=0;
        char c;
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);            
            if(c=='M')
            {
                sum=sum+1000;
            }
            else if(c=='D')
            {
                sum=sum+500;
            }
            else if(c=='C')
            {
                if(i<l-1)
                {
                    if(s.charAt(i+1)=='M')
                    {
                        sum=sum+900;
                        i++;
                    }
                    else if(s.charAt(i+1)=='D')
                    {
                        sum=sum+400;
                        i++;
                    }
                    else
                        sum=sum+100;
                }
                else
                        sum=sum+100;
                 
            }
            else if(c=='L')
            {
                sum=sum+50;
            }
            else if(c=='X')
            {
                if(i<l-1)
                {    
                   if(s.charAt(i+1)=='C')
                    {
                        sum=sum+90;
                        i++;
                    }
                    else if(s.charAt(i+1)=='L')
                    {
                        sum=sum+40;
                        i++;
                    }
                    else
                        sum=sum+10;
                }
                else
                    sum=sum+10;
            }
            else if(c=='V')
            {
                sum=sum+5;
            }
            else if(c=='I')
            {
                if(i<l-1)
                {
                    if(s.charAt(i+1)=='V')
                    {
                        sum=sum+4;
                        i++;
                    }
                    else if(s.charAt(i+1)=='X')
                    {
                        sum=sum+9;
                        i++;
                    }
                    else
                        sum=sum+1;
                }
                else
                    sum=sum+1;
            }
        }
        return sum; 
    }
}