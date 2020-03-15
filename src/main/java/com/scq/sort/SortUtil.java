package com.scq.sort;

import java.util.Arrays;

/**
 * @ClassName Demo1
 * @Description
 * @Author JavaQ
 * @Date 2019/12/28 14:18
 **/

public class SortUtil {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 2, 3, 5, 1, 6, 9, 10, 8, 15, 12, 11};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    // 快速排序
    public static void quickSort_2(int[] data, int start, int end) {
        if (data == null || start >= end) {
            return;
        }
        int i = start, j = end;
        int pivotKey = data[start];
        while (i < j) {
            while (i < j && data[j] >= pivotKey) {
                j--;
            }
            if (i < j) {
                data[i++] = data[j];
            }
            while (i < j && data[i] <= pivotKey) {
                i++;
            }
            if (i < j) {
                data[j--] = data[i];
            }
        }
        data[i] = pivotKey;
        quickSort_2(data, start, i - 1);
        quickSort_2(data, i + 1, end);
    }

    private static void quicksort(int[] a, int left, int right) {
        int low = left;
        int high = right;
        //下面两句的顺序一定不能混，否则会产生数组越界！！！very important！！！
        if (low > high)//作为判断是否截止条件
        {
            return;
        }
        int k = a[low];//额外空间k，取最左侧的一个作为衡量，最后要求左侧都比它小，右侧都比它大。
        while (low < high)//这一轮要求把左侧小于a[low],右侧大于a[low]。
        {
            while (low < high && k <= a[high])//右侧找到第一个小于k的停止
            {
                high--;
            }
            //这样就找到第一个比它小的了
            a[low] = a[high];//放到low位置
            while (low < high && k >= a[low])//在low往右找到第一个大于k的，放到右侧a[high]位置
            {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = k;//赋值然后左右递归分治求之
        quicksort(a, left, low - 1);
        quicksort(a, low + 1, right);
    }

}
