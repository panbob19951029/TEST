import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 11:12
 * 由于只需要找出数组中任意一个重复的数字，因此遍历数组，
 * 遇到重复的数字即返回。为了判断一个数字是否重复遇到，使用集合存储已经遇
 * 到的数字，如果遇到的一个数字已经在集合中，则当前的数字是重复数字
 *方法1:集合，不能重复add
 * 方法2：排序后，前后会有重复的
 *
 *
 */
public class findSameNum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int[] nums =new  int[n];
        int repeat =-1;
        Set<Integer> set =new HashSet<>();
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        System.out.println("输入的数组："+Arrays.toString(nums));
        for(int num : nums){
            if(!set.add(num)){
                System.out.println(num);
                repeat=num;
                //System.out.println(repeat);
            }else if (set.size() == n){
                System.out.println("无重复");
            }
    }

}

}
/*
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/mian-shi-ti-03-shu-zu-zhong-zhong-fu-de-shu-zi-b-4/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */
