class Solution {
    private Integer oldcolor; 
    public void fill(int[][] image, int sr, int sc, int newColor){
        if(image[sr][sc] != newColor){
            if(oldcolor == null)   oldcolor = image[sr][sc];
            image[sr][sc] = newColor;
            //go right
            if(sc+1<image[0].length && image[sr][sc+1] == oldcolor)    fill(image, sr, sc+1, newColor);  
            //go left
            if(sc-1>=0  && image[sr][sc-1] == oldcolor) fill(image, sr, sc-1, newColor);
            //go down
            if(sr+1<image.length && image[sr+1][sc] == oldcolor)    fill(image, sr+1, sc, newColor);
            //go up
            if(sr-1>=0 && image[sr-1][sc] == oldcolor)    fill(image, sr-1, sc, newColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        fill(image, sr, sc, newColor);
        return image;
    }
}