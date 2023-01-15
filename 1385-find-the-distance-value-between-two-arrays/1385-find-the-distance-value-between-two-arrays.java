class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(check(arr1[i],arr2,d))
                c++;
        }
        return c;
    }
    public static boolean check(int a,int arr[],int d)
    {
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if((Math.abs(arr[i]-a)<=d))
                return false;
        }
        return true;
    }
}