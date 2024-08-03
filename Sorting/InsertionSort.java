package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0,8,7,4,0,6,1,9};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;

            while (j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

}
