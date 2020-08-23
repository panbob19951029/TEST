/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/7 11:10
 */
import java.util.*;
public class GradeCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArrays = new int[n];
        for(int i=0;i<n;i++){
            nArrays[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int count = 0;
        for(int i=0;i<q;i++){
            int qArray = nArrays[scanner.nextInt()-1];
            for(int j=0;j<n;j++){
                if(nArrays[j]<=qArray){
                    count++;
                }
            }
            System.out.println(String.format("%.6f",(count-1)*100.0/n));
            count = 0;
        }
    }
}
