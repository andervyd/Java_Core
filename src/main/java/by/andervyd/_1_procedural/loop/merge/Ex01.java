package by.andervyd._1_procedural.loop.merge;

import java.util.Arrays;

public class Ex01 {

    public static int[] merge(int[] arr1, int[] arr2) { // NOT WORK !
        int[] result = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        while ((arr1Index + arr2Index) != result.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                result[arr1Index + arr2Index] = arr1[arr1Index++]; // << here
            } else {
                result[arr1Index + arr2Index] = arr2[arr2Index++]; // << here
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {4,0,4,1,7,5};
        int[] arr2 = {1,7,4,0,3,7};

        int[] arrMerge = merge(arr1, arr2);

        System.out.println(Arrays.toString(arrMerge));
        // >>
    }
}
