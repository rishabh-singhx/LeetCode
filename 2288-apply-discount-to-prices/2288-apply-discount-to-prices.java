class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] arr = sentence.split(" ");
        String result="";
        for(int i=0;i<arr.length;i++)
        {
            if(check(arr[i]))
            {
                double j=Double.parseDouble(arr[i].substring(1));
                j=j-(discount*j/100);
                arr[i]=String.format("%.2f", j);
                // arr[i]=String.valueOf(j);
                result=result+"$"+arr[i]+" ";
            }
            else
            {
                result=result+arr[i]+" ";
            }
        }
        return result.trim();
    }
    public static boolean check(String s)
    {
        if(s.charAt(0)=='$'&&s.length()>1)
        {
            for(int i=1;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
                {
                    
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}