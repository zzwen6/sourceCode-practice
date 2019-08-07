package top.hting.sort.select;

import top.hting.sort.BAS;

/**
 * 选择排序
 */
public class SS extends BAS {
    /**
     * 简单选择排序
     * 中心思想：寻找最小的值的下标后，与当前i比较，不相同则进行交换
     * 优点：减少了交换次数
     * @param arr
     */
    public static void selectSort(int[] arr) {
        print(arr, -1);
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j ++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            if (i != min) {
                swap(arr, i, min);
            }
            print(arr, i);
        }

    }
}
