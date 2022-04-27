class Solution {
    private int max = 0;
    private int counter = 0 ;
    
    public void rcrsv(int[][] grid,int i, int j){
        counter++;
        grid[i][j] = 0;
        if(i+1<grid.length && grid[i+1][j] == 1)      rcrsv(grid,i+1,j);
        if(i-1>=0 && grid[i-1][j] == 1)             rcrsv(grid,i-1,j);
        if(j+1<grid[0].length && grid[i][j+1] == 1) rcrsv(grid,i,j+1); 
        if(j-1>=0 && grid[i][j-1] == 1)             rcrsv(grid,i,j-1);
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        System.out.println(grid.length);
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1)   {
                    rcrsv(grid,i,j);
                    if (counter>max)    max = counter;
                    if(max == grid.length*grid[0].length)   return max;
                    counter = 0;
                }
            }
        }
        return max;
    }
}