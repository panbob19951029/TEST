package leetCode;


import java.util.*;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/3 16:56
 * 题目描述
 * 查找一个数组的第K小的数，注意同样大小算一样大。
 * 如  2 1 3 4 5 2 第三小数为3。
 */
public class newcodeKY190 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =10;
        int[] nums = {68,33,100,22,1,3,5,7,34,56};
        int k =3;
        Arrays.sort(nums);
        System.out.println("nums:"+Arrays.toString(nums));
        Set<Integer> set=new LinkedHashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        if(k>set.size()){
            System.out.println(" ");
        }
        System.out.println("set:"+set);
        List<Integer> list =new ArrayList<>(set);
        System.out.println("list:"+list);
        System.out.println("第"+k+"小的数为："+list.get(k-1));
    }
}
