package com.scq.search;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName SerchUtil
 * @Description
 * @Author JavaQ
 * @Date 2020/2/12 9:43
 **/
public class SearchUtil {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            System.out.println(object+":"+properties.get(object));
        }
    }


    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (value == arr[middle]) {
                return middle;
            }
            if (value < arr[middle]) {
                high = middle - 1;
            }
            if (value > arr[middle]) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
