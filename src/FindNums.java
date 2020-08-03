/**
 * @author b-p
 * @version 1.0
 * @date 2020/7/30 10:07
 * 题目意思：寻找输入字符串中的数字，并按升序排序，桶排序思想
 */
public class FindNums {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        String s = "爱讯飞789swr1wwen34ifly65tek";
        int[] res = new int[10];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char temp = s.charAt(i);//返回 指定索引 处的 char值。索引范围 是从0 到length() - 1。
            if (temp >= '0' && temp <= '9') {//判断有无0~9的数，如果有数字3则res[4]=1
                res[temp - '0']++;
            }
        }
        boolean isHaveNum = false;
        for (int i = 0; i < 10; i++) {//遍历res数组，判断是否全等于0，返回true则说明有数字
            if (res[i] != 0) {
                isHaveNum = true;
            }
        }
        if (isHaveNum) {
            for (int i =0; i <10; i++) {//若需要逆序数，则为 for(int i=res.length-1;i>-1;i--)
                for (int j = 0; j < res[i]; j++) {
                    System.out.print(i);
                }
            }
        } else {
            System.out.println("-1");
        }
    }
}
