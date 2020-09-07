package leetCode;

import java.util.*;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/3 15:56
 * 给定一个非空数组，返回此数组中第三大的数。
 * 如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *输入: [3, 2, 1]
 *
 * 输出: 1
 * 解释: 第三大的数是 1.
**/
public class leetcode414 {
    public static void main(String[] args) {
        int [] nums={2,1,3,5,4};
        Arrays.sort(nums);

        Set<Integer> set=new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        if(set.size()<3){
            System.out.println(nums[nums.length-1]);
        }else {
            List<Integer> list = new ArrayList<>(set);
            System.out.println(list.get(set.size()-3));
        }

    }
}
