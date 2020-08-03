/**
 * @author b-p
 * @version 1.0
 * @date 2020/7/30 16:36
 */
import java.util.Scanner;

public class QuickSort {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[100];
            int i;
            int n = sc.nextInt();
            for (i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            QuickSort(arr, 0, n-1);
            for (i = 0; i < n-1; i++){
                System.out.printf("%d ", arr[i]);
            }
            System.out.printf("%d", arr[i]);
        }

        private static void QuickSort(int[] num, int left, int right){
            // 如果left=right，即数组中只剩一个元素时，直接返回
            if (left >= right){
                return;
            }
            // 设置最左边的元素为基准值1
            int key = num[left];
            // 数组中比key小的放在左边，比key大的放在右边
            int i = left;
            int j = right;
            while (i < j){
                // j向左移动，直到碰到比key小的数
                while (num[j] >= key && i<j){
                    j--;
                }
                // i向右移动，直到碰到比key大的数
                while (num[i] <= key && i<j){
                    i++;
                }
                // i和j指向的元素交换
                if (i < j){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            num[left] = num[i];
            num[i] = key;
            QuickSort(num, left, i-1);
            QuickSort(num, i+1, right);
        }
    }

