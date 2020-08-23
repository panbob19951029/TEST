import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/11 9:59
 * 统计一个数字在排序数组中出现的次数。输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 */
public class FindSameNum2 {
    public static void main(String[] args) {
    int [] nums =new int[]{1,2,3,4,8,8,8,9};
    int target =8;
        int index = Arrays.binarySearch(nums, target);
        System.out.println(index);
        if(index<0)System.out.println(0);
        int cnt = 1;
        for(int i=index+1; i < nums.length && nums[i]==target;i++)
            cnt++;
        for(int i=index-1; i >= 0 && nums[i]==target;i--)
            cnt++;
        System.out.println(cnt);
    }

}
