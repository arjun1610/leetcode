package arrays;
/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/unique-paths/
 *
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // // bottom up
        int paths[][] = new int [m][n];
        for (int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if (i == 0 || j ==0)
                    paths[i][j] = 1;
                else
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        return paths[m-1][n-1];
        // return helper(m-1, n-1, paths);
    }
     // top down
     public int helper(int row, int col, int[][] paths) {
         if (row == 0 || col ==0)
             return 1;
         if ( paths[row][col] == 0)
             paths[row][col] = helper(row-1, col, paths) + helper(row, col-1, paths);
         return paths[row][col];
     }
}