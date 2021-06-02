package by.andervyd._1_procedural.loop.merge;

import java.util.Arrays;

public class Ex00 {

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] arrMerge = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arrMerge[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arrMerge[count++] = arr2[j];
        }
        return arrMerge;
    }

    public static void main(String[] args) {

        int[] arr1 = {4,0,4,1,7,5};
        int[] arr2 = {1,7,4,0,3,7};

        int[] arrMerge = mergeTwoArrays(arr1, arr2);

        System.out.println(Arrays.toString(arrMerge));
        // >> [4, 0, 4, 1, 7, 5, 1, 7, 4, 0, 3, 7]
    }
}
