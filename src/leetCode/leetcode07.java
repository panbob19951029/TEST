package leetCode;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/31 21:54
 */
public class leetcode07 {
    public static void main(String[] args) {
        int x =-121;
        int temp=x;
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>Integer.MAX_VALUE || (res==Integer.MAX_VALUE && tmp>7)) {
                System.out.println(0);
            }
            //判断是否 小于 最小32位整数
            if (res<Integer.MIN_VALUE || (res==Integer.MIN_VALUE && tmp<-8)) {
                System.out.println(0);
            }
            res = res*10 + tmp;
            x /= 10;
        }
        System.out.println(res);
        /*if(res == temp){
            System.out.println("true");
        }*/


    }
}
