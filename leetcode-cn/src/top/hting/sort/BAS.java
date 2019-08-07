package top.hting.sort;

import java.util.Arrays;

public class BAS {
    protected static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    protected static void print(int[] arr, int i){
        System.out.printf("第[%d]次排列后,当前数组: %s \n", i+1, Arrays.toString(arr));
    }
}
