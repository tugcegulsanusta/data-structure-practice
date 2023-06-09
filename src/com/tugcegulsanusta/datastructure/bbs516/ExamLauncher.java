package com.tugcegulsanusta.datastructure.bbs516;

import java.util.Arrays;

public class ExamLauncher {

    public static void main(String[] args) {
        testSort(new SelectionSort(), new int[]{56, 51, 57, 52, 99, 90, 69, 33, 86, 62});
        testSort(new InsertionSort(), new int[]{56, 51, 57, 52, 99, 90, 69, 33, 86, 62});
        testSort(new QuickSort(), new int[]{37, 33, 25, 10, 29, 79, 75, 72 ,21, 56});
    }

    private static void testSort( IntegerSorter sorter, int[] input ) {
        System.out.println("\n ****  "+sorter.getClass().getSimpleName()+"  ****");
        System.out.println("INPUT  : "+Arrays.toString(input));
        int[] output = sorter.sort(input);
        System.out.println("SORTED : "+Arrays.toString(output));
    }

    public static void swap( int[] input, int i, int j ){
        int temp = input[i];
        input[i]=input[j];
        input[j]=temp;
    }

}
