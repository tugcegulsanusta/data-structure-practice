package com.tugcegulsanusta.datastructure.bbs516;

import java.util.Arrays;

public class SelectionSort implements IntegerSorter{
    @Override
    public int[] sort(int[] input) {
        for (int startIndex = 0; startIndex < input.length; startIndex++) {
            int smallestIndex = startIndex;
            for (int i = startIndex; i <  input.length ; i++) {
                if(input[smallestIndex]>input[i]){
                    smallestIndex = i;
                }
            }
            for (int i = smallestIndex; i > startIndex; i--) {
                ExamLauncher.swap(input,i,i-1);
            }
            System.out.println((startIndex+1) + " STEP: "+ Arrays.toString(input) +"\t small: "+input[startIndex]);
        }
        return input;
    }


}
