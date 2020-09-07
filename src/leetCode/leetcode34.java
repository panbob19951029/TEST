package leetCode;

import java.util.Arrays;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/2 11:56
 * 在排序数组中查找元素的第一个和最后一个位置
 *: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 */
public class leetcode34 {
    public static void main(String[] args) {
        int []nums={1,2};
        int i =0,j=nums.length-1;
        int target=3;
        int [] res =new int[2];
        // 搜索右边界 right
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i-1;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target||j<0) {
            res[0]=-1;
            res[1]=-1;
            System.out.println(Arrays.toString(res)); ;
        }
        // 搜索左边界
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        //左下标
        int left = j+1;
        res[0]=left;
        res[1]=right;
        System.out.println(Arrays.toString(res));
    }
}
