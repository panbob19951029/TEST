/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/7 12:48
 */
import java.util.Scanner;
import java.util.Arrays;

public class Xulie2 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int q = input.nextInt();

            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = input.nextInt();
            }
            int count=0;
            int[] x = new int[q];
            for(int j = 0; j < q; j++){
                x[j] = input.nextInt();
            }

            Arrays.sort(a);
            for(int j = 0; j < q; j++){
                int index = n - 1;
                for(; index >= 0; index--) {//倒序遍历
                    if(a[index] >= x[j]) {//比较与输入的x
                        a[index]--;
                        count++;
                    }
                    else
                        break;
                }

                System.out.println(count);
                count=0;
            }
        }
    }

