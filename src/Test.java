import java.lang.reflect.Array;
import java.util.*;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 12:00
 */
public class Test {


    private static char[] c;
    private static List<String> res;

    public static void main(String[] args) {
        //二维数组
        // erwei();
        //reverseWords();
        //reverseNum();
        //findmin();
       // quickSort();
        //slidWindow();//wrong
        //findNull();
        //findTarget();
        //linkedlist();
        //Add();//不用+-*/做加法
        //findNums1IN2or3();//找到数组中重复次数为N的数字，用Map

        //findNums1In2();
        //cengxu();
        //uglyNumber();
        //gupiao();
        //pinjieNum();
        //pinjieNum2();
        //zimupailie();
        //NumTranslate();
        //robotRun();
        //chongfuChar();
        //twoNums();//map
        //weiOne();

    }

    private static void weiOne() {
        int s =000000000000001011;
        String s1=Integer.toString(s);
        char[] str =s1.toCharArray();
        System.out.println(str);
        int count=0;
        for (int i =0;i<str.length;i++) {
            if (str[i] == '1') {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void twoNums() {
        int [] nums={2,11,7,15};
        int target =9;
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(Arrays.toString(new int[]{map.get(complement), i})); ;
            }
            map.put(nums[i], i);

        }

}

    private static void chongfuChar() {
        String s ="abcabcdefgha";
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i

            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            System.out.println("temp:"+tmp);
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        System.out.println(res);

    }

    private static void robotRun() {
        int m =7 ,n =2 ,k=6;
            //临时变量visited记录格子是否被访问过
            boolean[][] visited = new boolean[m][n];
            System.out.println(dfs(0, 0, m, n, k, visited));
        }

        public static int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
            //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
            // 满足条件，visited[i][j]判断这个格子是否被访问过
            if (i >= m || j >= n || k < sum(i, j) || visited[i][j])
                return 0;
            //标注这个格子被访问过
            visited[i][j] = true;
            //沿着当前格子的右边和下边继续访问
            return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
        }



    //计算两个坐标数字的和
    private static int sum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }

    private static void NumTranslate() {
         int num =12258;
                String s = String.valueOf(num);
                int a = 1, b = 1;
                for(int i = 2; i <= s.length(); i++) {
                    String tmp = s.substring(i - 2, i);
                    int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
                    b = a;//
                    a = c;
                }
                System.out.println(a);




    }

    private static void zimupailie() {
        res = new LinkedList<>();

        String s ="abc";
        c = s.toCharArray();
        System.out.println(c);//abc
        //String[] n=s.split("");
        //System.out.println(Arrays.toString(n));//[a, b, c]
        dfs(0);
        System.out.println(Arrays.toString(res.toArray(new String[res.size()])));
    }

    private static void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c)); // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x); // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1); // 开启固定第 x + 1 位字符
            swap(i, x); // 恢复交换
        }
    }
    static void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
            /*static void dfs(int x) {
                if(x == c.length - 1) {
                    res.add(String.valueOf(c)); // 添加排列方案
                    return;
                }
                HashSet<Character> set = new HashSet<>();
                for(int i = x; i < c.length; i++) {
                    if(set.contains(c[i])) continue; // 重复，因此剪枝
                    set.add(c[i]);
                    swap(i, x); // 交换，将 c[i] 固定在第 x 位
                    dfs(x + 1); // 开启固定第 x + 1 位字符
                    swap(i, x); // 恢复交换
                }
            }
           static void swap(int a, int b) {
                char tmp = c[a];
                c[a] = c[b];
                c[b] = tmp;
    }*/


    private static void pinjieNum2() {
        int [] nums={3,30,34,5,9};
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        fastSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        System.out.println(res.toString());
    }
    static void fastSort(String[] strs, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while(i < j) {
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        fastSort(strs, l, i - 1);
        fastSort(strs, i + 1, r);

    }
    private static void pinjieNum() {
        int[] nums ={3,30,34,5,9,0};

                String[] strs = new String[nums.length];
                for(int i = 0; i < nums.length; ++i){
                    strs[i] = String.valueOf(nums[i]);}
                System.out.println(Arrays.toString(strs));
                //定义排序规则，330>303,取303
                Arrays.sort(strs,(x, y) -> (x + y).compareTo(y + x));

                StringBuilder sb = new StringBuilder();
                for(String s: strs)
                    sb.append(s);
                System.out.println(sb.toString());

    }

    private static void gupiao() {
        int [] prices={7,1,5,3,6,4};
        if(prices.length == 0) System.out.println(0);
        int res = 0, min = prices[0];
        for(int i = 0; i < prices.length; i ++){
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i] - min);
        }
        System.out.println(res);
    }


    private static void uglyNumber() {

           int n =20;
                int a = 0, b = 0, c = 0;
                int[] dp = new int[n];
                dp[0] = 1;
                for(int i = 1; i < n; i++) {
                    int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
                    dp[i] = Math.min(Math.min(n2, n3), n5);
                    if(dp[i] == n2) a++;
                    if(dp[i] == n3) b++;
                    if(dp[i] == n5) c++;
                    System.out.println(dp[i]);
                }
               System.out.println(dp[n - 1]);



    }

    private static void cengxu() {
        Queue<Integer> queue =new ArrayDeque<>();   //先进先出
        queue.add(1);
        queue.add(2);
        System.out.println(queue);//[1,2]
        int a=queue.poll();
        System.out.println(a);//1
        int b =queue.poll();
        System.out.println(b);//2
    }

    private static void findNums1In2() {
        int[] nums={1,5,10,4,1,4,3,3};
        System.out.println(Arrays.toString(nums));
        Map<Integer, Integer> map = new HashMap<>();
        int [] res =new int[2];
        for(int i:nums){
            if(map.containsKey(i)){
                int temp = map.get(i);//返回key的value
                map.put(i, temp+1);

            }
            else
                map.put(i, 1);
            //System.out.println(map);
        }
        System.out.println("map.keySet():"+map.keySet());//map.keySet():[1, 3, 4, 5, 10]
        int count =0;
        //遍历key
        for(int i : map.keySet()){//i=key,
            System.out.println("map.get(i)=:"+map.get(i));
            if(map.get(i) == 1){//获取i的value，如果出现1次则显示
                res[count]=i;
            count++;}
        }
        System.out.println(Arrays.toString(res));
    }

    private static void findNums1IN2or3() {
           int[] nums={1,2,10,4,1,4,3,3};//map.getOrDefault(n,0)
            System.out.println(Arrays.toString(nums));
                Map<Integer, Integer> map = new HashMap<>();
               Set<Integer> res = new HashSet<>();
                for(int i:nums){
                    if(map.containsKey(i)){
                        int temp = map.get(i);//返回key
                        map.put(i, temp+1);

                    }
                    else
                        map.put(i, 1);
                    //System.out.println(map);
                }
                //遍历Key，如果只出现一次则Key为1
                for(int i : map.keySet()){
                    if(map.get(i) == 1)
                      res.add(i);
                }
                System.out.println(res);
    }


    private static void Add() {
        int a=2,b=3;
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            System.out.println(a & b);
            System.out.println(c);
            a ^= b; // a = 非进位和
            System.out.println(a);
            b = c; // b = 进位
            System.out.println(b);
        }
        System.out.println(a);
    }

    private static void linkedlist() {
        LinkedList<Integer> stack =new LinkedList<>();
        int[] res = new int[10];
        int[] res1 = new int[10];
        for (int i = 0; i < 10; i++) {
            stack.addLast(i);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        }
        System.out.println(stack);
        for (int i = 0; i < 10; i++) {
            res[i]=stack.removeLast();// 删除并返回列表的最后一个元素（第一个被添加的元素）getLast()只会获取而不删除，所以达不到倒序
        }
        System.out.println(Arrays.toString(res));//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
    }


    private static void findTarget() {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(array[0][2]);
        System.out.println(array[0].length);
        System.out.println(array.length);
        Set<Integer> set =new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                set.add(array[i][j]);

            }

        }System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.contains(1));
    }

    private static void findNull() {
        int [] nums = new int[] {0,1,2,3,4,5,6,7,8,9,11};
        if (nums[0]==1) System.out.println(0);
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=i) System.out.println(i);
        }
        //System.out.println( nums.length);
    }

    private static void slidWindow() {
        int [] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k =3,res;
        int temp;
        int [] res1 =new int [nums.length-k+1];

            for (int j = 0; j <nums.length-k+1; j++) {
                temp=Math.max(nums[j],nums[j+1]);
                res=Math.max(temp,nums[j+2]);
                System.out.println(res);
                res1[j]=res;
            }
            System.out.println(Arrays.toString(res1));

    }

    private static void maopao() {
        //冒泡
        int[] ary=new int[]{90,50,40,60,55};
        //外层循环控制有多少个数需要比较的轮数，最原始最后一位数不需要冒泡，数组长度减一
        for (int i=1;i<ary.length;i++){
            //内层循环控制每个轮次的第一个数比较换位的过程
            for (int j=0;j<ary.length-1;j++){
                //如果这个轮次的第一个数大于其后的数就一直换位，直到比他大的数出现,不换位了，新的序列生成
                if (ary[j]>ary[j+1]){
                    int tmp;
                    tmp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=tmp;
                }
            }
        }
        //foreach()遍历输出
        for (int i:ary){
            System.out.print(i+"\t");
        }


    }


    private static void findmin() {
        int[] numbers = new int[]{3, 4, 5,1,2};
        int k =2;
        Arrays.sort(numbers);
        for (int i = 0; i < k; i++) {
            System.out.println(numbers[i]);
        }
    }

    //二分查找
    private static void reverseNum() {
        int[] numbers = new int[]{3, 4, 5,0,1,2};
        int i = 0, j = numbers.length - 1;
        while (i <j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m-1;
            else j--;
        }
        System.out.println(numbers[i]);

    }

    private static void reverseWords() {
        String s =" hello    world ";

                String[] strs = s.trim().split(" "); // 删除首尾空格，用空格分割字符串

                StringBuilder res = new StringBuilder();
                for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
                    if(strs[i].equals("")) continue; // 遇到空单词则跳过
                    res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
                }
               System.out.println(res.toString().trim()) ; // 转化为字符串，删除尾部空格，并返回



    }

    private boolean findSame(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (matrix[i][j] == target) {
                    return true;
                }

            }

        }
        return false;
    }
    private static void erwei() {
        Scanner sc=new Scanner(System.in);
        int numCount=sc.nextInt(); // 第一行输入二维数组的个数
        int[][] numArrs=new int[numCount][];
        for(int i=0;i<numCount;i++){
            int l=sc.nextInt(); //第二行输入第一维元素的个数；//第四行输入第二维元素的个数
            numArrs[i]=new int[l];
            for(int j=0;j<l;j++){
                numArrs[i][j]=sc.nextInt();//第三行输入第一维的元素；        //第五行输入第二维的元素
            }

        }
             System.out.println(Arrays.deepToString(numArrs));
    }
}

