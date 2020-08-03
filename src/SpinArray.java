import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 9:27
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class SpinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int [] spinArray =new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            spinArray[i]=array[n-i];
        }
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("spinArray:"+ Arrays.toString(spinArray));

    }
}
