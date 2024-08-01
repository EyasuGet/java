package Sorting;

public class BinarySearch {
    public static int binarySearch(int[] array, int value) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else if (array[mid] > value) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 6, 7, 8};
        int target = 7;
        int result = binarySearch(list,target);
        if (result == -1) {
            System.out.println("ellement not found!!!");
        }else{
        System.out.println(result);}

    }

}
