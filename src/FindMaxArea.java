
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class FindMaxArea {
    /**
    给定一个数组，取四条边组成最大平行四边形的面积，输入数组，输出最大面积。
把数组排序并取个数超过2的最大的两个即可
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//new一个键盘输入监听
        int n = scanner.nextInt();//定义输入数组长度
        long[] lines = new long[n];//new一个长度为n的数组
       /* for (int i = 0; i <n ; i++) {
            lines[i]=scanner.nextInt();
        }*/
        int i = 0;
        while (i < n) {
            lines[i++] = scanner.nextInt();//输入n个数，并填入数组
        }
        Arrays.sort(lines);//排序
        List<Long> side = new ArrayList<>();//因为平行四边形只需要2对长度最长的数，则new一个List填入2个数
        int count = 1;//计数
        for (i = n - 1; i >= 0; i--) {
            if (side.size() >= 2) {//找到2对数后break
                break;
            }
            if (i > 0 && lines[i] == lines[i - 1]) {//从最大的数开始遍历找到一对相同的数
                count++;
            } else {
                if (count >= 4) {
                    side.add(lines[i]);
                    side.add(lines[i]);
                } else if (count >= 2) {
                    side.add(lines[i]);//填入一个数
                }
                count = 1;
            }
        }
        if (side.size() < 2) {
            System.out.println(-1);
        } else {
            System.out.println(side.get(0) * side.get(1));
        }
    }
}
