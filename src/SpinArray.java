import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 9:27
 *数组倒序输出
 */
public class SpinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        for (int end = array.length-1,start=0 ; end >start; end--,start++) {
            int temp =array[end];
            array[end]=array[start];
            array[start]=temp;
        }
        System.out.println("spinArray:"+ Arrays.toString(array));


    }
}
