class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //Arrays.sort(arr2);
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
        
        
        //||(Math.abs(arr[arr.length-1]-a)<=d)
        // int lb=0,ub=n-1;
        // int mid;
        // while(lb<=ub )
        // {
        //     mid=(ub+lb)/2;
        //     if(Math.abs(arr[mid]-a)>d))
        //     {
        //         return mid;
        //     }
        //     else if(arr[mid]>arr[mid+1])
        //     {
        //         ub=mid-1;
        //     }
        //     else if(arr[mid]>arr[mid-1])
        //     {
        //         lb=mid+1;
        //     }
        // }
        return true;
    }
}