class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<n;i++)
        {
            for(int k=0,j=m-1;k<=j;j--,k++)
            {
                int temp=image[i][k];
                image[i][k]=image[i][j];
                image[i][j]=temp;
                if(k!=j)
                {
                    if(image[i][k]==0)
                        image[i][k]=1;
                    else
                        image[i][k]=0;
                    if(image[i][j]==0)
                        image[i][j]=1;
                    else
                        image[i][j]=0;
                }
                else
                {
                    if(image[i][k]==0)
                        image[i][k]=1;
                    else
                        image[i][k]=0;
                }
            }
        }
        return image;
    }
}