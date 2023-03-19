class Solution {
    public boolean checkValidGrid(int[][] grid) 
    {
        if(grid[0][0]!=0)
            return false;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                //System.out.print(check(grid,i,j)+" ");
                if(check(grid,i,j)==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(int[][] grid,int row,int col)
    {
        if(grid[row][col]==((grid.length*grid.length)-1))
            return true;
        if(row<grid.length-2)
        {
            if(col<grid.length-1)
            {
                if(((grid[row][col])+1)==((grid[row+2][col+1])))
                {
                    System.out.print(" A  "+row+" "+col);
                    return true;
                }
            }
            if(col>0)
            {
                if(((grid[row][col])+1)==((grid[row+2][col-1])))
                {
                     System.out.print(" B  "+row+" "+col);
                    return true;
                }
            }       
        }
        if(row>1)
        {
            if(col<grid.length-1)
            {
                if(((grid[row][col])+1)==((grid[row-2][col+1])))
                {
                    System.out.print(" C  "+row+" "+col);
                    return true;
                }
            }
            if(col>0)
            {
                if(((grid[row][col])+1)==((grid[row-2][col-1])))
                {
                    System.out.print(" D  "+row+" "+col);
                    return true;
                }
            }       
        }
        if(col<grid.length-2)
        {
            if(row<grid.length-1)
            {
                if(((grid[row][col])+1)==((grid[row+1][col+2])))
                {
                    System.out.print(" E  "+row+" "+col);
                    return true;
                }
            }
            if(row>0)
            {
                if(((grid[row][col])+1)==((grid[row-1][col+2])))
                {
                    System.out.print("F  "+row+" "+col);
                    return true;
                }
            }       
        }
        if(col>1)
        {
            if(row<grid.length-1)
            {
                if(((grid[row][col])+1)==((grid[row+1][col-2])))
                {
                    System.out.print(" G  "+row+" "+col);
                    return true;
                }
            }
            if(row>0)
            {
                if(((grid[row][col])+1)==((grid[row-1][col-2])))
                {
                    System.out.print(" H  "+row+" "+col);
                    return true;
                }
            }       
        }
        return false;              
    }
}