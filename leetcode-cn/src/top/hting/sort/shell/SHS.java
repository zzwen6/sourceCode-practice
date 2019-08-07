package top.hting.sort.shell;

import top.hting.sort.BAS;

/**
 * 希尔排序
 */
public class SHS extends BAS {

    public static void shellSort(int[] arr){
        print(arr, -1);
        int len = arr.length;
        int count = 0;
        do {
            len = len / 2;
            for (int i = 0; i < len; i++) {
                for (int j = len + i; j < arr.length; j = j+len) {
                    int temp = arr[j];
                    int f;
                    for (f = j -len; f >=0 && temp < arr[f]; f = f -len) {
                        arr[f+len] = arr[f];
                    }
                    arr[f+len] = temp;

                }
            }

            print(arr, count++);
        }while (len != 1);


    }


}
