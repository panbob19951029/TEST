package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/4 14:16
 */
public class offer29 {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        //if(matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        List<Integer> list =new ArrayList<>();

        while(true) {
         /*  for(int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            if(++t > b) break;
            for(int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            if(l > --r) break;
            for(int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            if(t > --b) break;
            for(int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            if(++l > r) break;*/
         //逆时针
         for(int i=t ;i<=b;i++) res[x++]=matrix[i][l];//top->bottom
            System.out.println(Arrays.toString(res));
            if(++l>r) break;
            for(int i =l;i<=r;i++) res[x++]=matrix[b][i];   //  l->r
            System.out.println(Arrays.toString(res));
            if(--b<t) break;
            for(int i=b;i>=t;i--) res[x++]=matrix[i][r];   //b->t
            System.out.println(Arrays.toString(res));
            if(--r<l) break;
            for(int i =r;i>=l;i--) res[x++]=matrix[t][i];  //r->l
            System.out.println("l"+Arrays.toString(res));
            if(++t>b) break;

        }
        System.out.println(Arrays.toString(res));
    }
}
