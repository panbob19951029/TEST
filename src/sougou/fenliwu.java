package sougou;

import java.util.*;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/7 11:21
 */
public class fenliwu {
    public static void main(String[] args) {
        int a = 12, b = 4, c = 3;
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        int max = list.get(2);
        int med = list.get(1);
        int min = list.get(0);
        //第一种情况：如9，4，3：想象先将最小的增加到与mid相同，则变为7，4，4，
        //然而max还有多的，若能继续平均，则设可以给mid和min增加x个。那么max-4x>=mid+x
        //所以需要求(max-med) / 5，求得x则为可以增加的个数
        if (max - (med - min) * 2 >=med ) {
            max -= 2 * (med - min);
            int temp = (max-med) / 5 ;//Math.max((max - med) / 5, 0);
            System.out.println(temp + med); ;
        } else {
            //反之，0<=max-mid<=1,二者一起补充最小值，从中间值取出一，就相当于给最小值加一，所以相当于求二者平均值
            min = (max - med) / 2 + min;
            System.out.println((min + med) / 2);;
        }
    }
}
