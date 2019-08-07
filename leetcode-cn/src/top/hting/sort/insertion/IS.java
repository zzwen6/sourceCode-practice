package top.hting.sort.insertion;

import top.hting.sort.BAS;

/**
 * 直接插入
 */
public class IS extends BAS {

    public static void insertionSort(int[] arr){
        print(arr, -1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                int k = i-1;
                for (int j = k; j >=0 && temp < arr[j]; j--) {
                    arr[j+1] = arr[j];
                    k--;
                }
                arr[k+1] = temp;
            }
            print(arr, i-1);
        }


    }

}
