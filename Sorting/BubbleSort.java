package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={0,8,7,4,0,6,1,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i -1; j++) {  //since we dont need to check again after every iteration it is sorted,so we can subtract i
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
