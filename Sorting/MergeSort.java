package Sorting;
public class MergeSort{
    private static void MergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if(inputLength < 2) {
            return;
        }
        int midIndex = inputArray.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i - midIndex] = inputArray[i];
        }
        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i] = inputArray[i];
        }
        MergeSort(leftHalf);
        MergeSort(rightHalf);
//Merge
        Merge(inputArray, leftHalf, rightHalf);
    }
    private static void Merge(int[] inputArray, int[] leftH, int[] rightH) {

        int leftSize = leftH.length;
        int rightSize = rightH.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftSize && j < rightSize) {
            if(leftH[i] <= rightH[j]) {
                inputArray[k] = leftH[i];
                i++;
            }
            else {
                inputArray[k] = rightH[j];

            }
            k++;
        }
        while(i < leftSize) {
            inputArray[k] = leftH[i];
            i++;
            k++;
        }
        while(j < rightSize) {
            inputArray[k] = rightH[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,7,3,0};
        MergeSort(arr);

    }


}
