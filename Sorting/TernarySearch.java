package Sorting;

import java.util.Scanner;

public class TernarySearch {
    public static int ternarysearch(int[] list,int target) {
        return ternarysearch(list,target,0,list.length-1);
    }
    public static int ternarysearch(int[] list,int target,int left,int right) {
        ;
        int mid1 = left + (right - left)/3;
        int mid2 = left + 2*(right - left)/3;
        if (mid2 == target) {
            return mid2;
        }else if (mid1 ==  target) {
            return mid1;
        }else if (mid1 > target) {
            return ternarysearch(list,target,left,mid1-1);
        }else if (mid2 <target) {
            return ternarysearch(list,target,mid2+1,right);
        }else{
            return ternarysearch(list,target,mid1+1,mid2-1);
        }
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a list of integer separated by space : ");
        int[] nums = new int[]{myobj.nextInt()};
        System.out.println("Enter the value to be found: ");
        int value = myobj.nextInt();
        int result = ternarysearch(nums,value);
        System.out.println(result);
    }

}
