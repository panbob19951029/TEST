package leetCode;

import java.util.Arrays;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/5 11:40
 */
public class ths {
    public static void main(String[] args) {
        //suzhu();
        //fenge();
        jiou();

    }



    private static void jiou() {
        int num =3;
        if((num&1)!=0){
            System.out.println("奇数");
        }else System.out.println("偶数");
    }

    private static void fenge() {
        String s= "  s n c md  ";
        String[] strs = s.trim().split(" "); // 删除首尾空格，用空格分割字符串
        System.out.println("str:"+ Arrays.toString(strs));


    }

    private static void suzhu() {
        int [] nums={1,2,6,0,0,0,6,0,2,0};
        Arrays.sort(nums);
        int [] res =new int[nums.length];
        System.out.println(Arrays.toString(nums));
        int x=0;
        for (int i = nums.length-1; i >-1 ; i--) {
            res[x++]=nums[i];

        }
        System.out.println(Arrays.toString(res));
    }
}
