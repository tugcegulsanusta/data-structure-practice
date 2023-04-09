package com.tugcegulsanusta.datastructure.bbs516;

import java.util.Arrays;

public class InsertionSort implements IntegerSorter{
    @Override
    public int[] sort(int[] input) {
        for (int startIndex = 1; startIndex < input.length; startIndex++) {
            int pivot = input[startIndex];
            for (int i = startIndex; i > 0 ; i--) {
                if(input[i]<input[i-1]){
                    ExamLauncher.swap(input,i,i-1);
                }else{
                    break;
                }
            }
            System.out.println((startIndex) + " STEP: "+ Arrays.toString(input) +"\t pivot: "+ pivot);
        }
        return input;
    }


}
