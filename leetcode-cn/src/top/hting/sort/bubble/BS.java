package top.hting.sort.bubble;

import top.hting.sort.BAS;

/**
 * bubblesort 两两比较相邻记录
 */
public class BS extends BAS {

    /**
     * 最简单的冒泡，遍历所有。 O(n^2)
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        long start = System.currentTimeMillis();
        //print(arr, -1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {

                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            //print(arr, i);
        }
        System.out.println("need: " + (System.currentTimeMillis() - start) );
    }

    /**
     * 冒泡2： 从后向前进行比较交换，可以减少交换次数
     * @param arr
     */
    public static void bubbleSort2(int[] arr){
        //print(arr, -1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length -1; j>= i; j--) {

                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            //print(arr, i);
        }
    }

    /**
     * 这个标志位的使用还是有问题
     * @param arr
     */
    public static void bubbleSort3(int[] arr){
        print(arr, -1);
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            for (int j = arr.length -1; j> i; j--) {
                flag = false;
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    flag = true;
                }
            }
            print(arr, -1);
        }
    }

}
