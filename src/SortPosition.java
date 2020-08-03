
import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：__椰子皮__
 * 链接：https://www.nowcoder.com/discuss/457642
 * 来源：牛客网
 *
 * 有一个操可以把数组的一个元素提到0号位置，给定一个数组，输出至少多少次这样的操作使数组变得有序。
 * 先把数组排序，如array [2 1 3 4]变为sortArray[1 2 3 4]，从后向前遍历两个数组，当array中的数值不等于sortArray中的值时，跳过(这个值也就是要变换位置的值)。AC100%
 */
public class SortPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] sortArray = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sortArray[i] = array[i];
        }
        Arrays.sort(sortArray);//排序sortArray
        int c = 0;
        int j = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if(array[i] == sortArray[j]){ //对比两个数组，注意这里是sortArray[j]
                ++c;
                --j;
            }
        }
        System.out.println(n-c);
    }
}