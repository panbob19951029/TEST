/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 14:15
 * 方法一：两个for
 * 方法二：线性查找：从matrix[0][columns-1]反向搜
 * 从二维数组的右上角开始查找。如果当前元素等于目标值，
 * 则返回 true。如果当前元素大于目标值，则移到左边一列。如果当前元素小于目标值，则移到下边一行。
 *方法三：左下角标志数法
 *//*

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

}
//标志数性质： 将 matrix 中的左下角元素（标志数）记作 flag ，则有:
//
//若 flag > target ，则 target 一定在 flag 所在行的上方，即 flag 所在行可被消去。
//若 flag < target ，则 target 一定在 flag 所在列的右方，即 flag 所在列可被消去。
//链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/solution/mian-shi-ti-04-er-wei-shu-zu-zhong-de-cha-zhao-zuo/

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
*/
