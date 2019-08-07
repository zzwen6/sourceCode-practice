
import top.hting.sort.insertion.IS;
import top.hting.sort.select.SS;
import top.hting.sort.shell.SHS;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    static final int LEN = 100000;

    public static void main(String[] args) {
//        int[] arr = new int[LEN];
//        for (int i = 0; i < LEN; i++) {
//            int num = new Random().nextInt(1000000);
//            arr[i] = num;
//        }

        int[] arr = {9,1 ,5,8,3,7,4,6,2};
//        int[] arr = {2,1,3,4,6,5,7,8,9};
        long start = System.currentTimeMillis();
//        BS.bubbleSort(arr);
//        BS.bubbleSort2(arr);
//        BS.bubbleSort3(arr);
//        SS.selectSort(arr);
//        IS.insertionSort(arr);
        SHS.shellSort(arr);
        System.out.println("need: " + (System.currentTimeMillis() - start));
        System.out.println("排序结果: " + Arrays.toString(arr));

        // System.out.println(new Main().numJewelsInStones("aA", "zzZZ"));
//        System.out.println(new Main().removeOuterParentheses("(()())(())(()(()))"));
    }

    // 1021
    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        boolean first = true;
        int start =0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                if (first) {
                    start = i;
                    first = false;
                }
                stack.push(ch);
            } else if( ch == ')' ){
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    builder.append(S.substring(start + 1, end));
                    start = end;
                    first = true;

                }
            }



        }


        return builder.toString();
    }


    public int numJewelsInStones(String J, String S) {
        int num = 0;

        for (int i = 0; i < J.length(); i++) {
            char ch = J.charAt(i);
            int fromIndex = 0;
            while ( ( fromIndex =  S.indexOf(ch, fromIndex) ) != -1) {
                fromIndex += 1;
                num += 1;
            }

        }
        return num;


    }
}
