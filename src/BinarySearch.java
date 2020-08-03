/**
 * @author b-p
 * @version 1.0
 * @date 2020/7/30 10:09
 * 题目意思：二分查找一个数组中的数字，要求必须用递归
 */
public class BinarySearch {
    private static boolean isFind;

    private static int idx;

    public static int findNum(int[] nums, int num) {  // 找到索引位
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int len = nums.length;
        findNum(nums, 0, len - 1, num);
        return idx;
    }

    public static void findNum(int[] nums, int l, int r, int num) {
        if (isFind || l > r) {
            return;
        }
        int cur = (l + r) >> 1;  // 取区间的中间值
        if (nums[cur] == num) {
            idx = cur;
            isFind = true;
            return;
        }
        findNum(nums, l, cur - 1, num);
        findNum(nums, cur + 1, r, num);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        String s = "{11,13,15,17,19,21}";

        int len = s.length();
        //第一个int为开始的索引，对应String数字中的开始位置，
        //第二个是截止的索引位置，对应String中的结束位置
        //1、取得的字符串长度为：endIndex - beginIndex;
        //2、从beginIndex开始取，到endIndex结束，从0开始数，其中不包括endIndex位置的字符
        String substring = s.substring(1, len - 1);  // 去掉输入的 {}
        String[] strings = substring.split(","); // 以 "," 分割

        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {   // 得到 nums 数组
            nums[i] = Integer.parseInt(strings[i]);
        }

        int num = 19;  // 要在数组中寻找的值
        isFind = false;
        idx = -1;
        System.out.println(findNum(nums, num) + 1);
    }

}
