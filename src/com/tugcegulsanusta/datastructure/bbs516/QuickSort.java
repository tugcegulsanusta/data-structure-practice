package com.tugcegulsanusta.datastructure.bbs516;

import java.util.Arrays;

public class QuickSort implements IntegerSorter{
    @Override
    public int[] sort(int[] a) {
        quickSort(a, 0, a.length - 1);
        return a;
    }

    private void quickSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        quickSort(a, lo, j-1);

        quickSort(a, j+1, hi);
        System.out.println( "X STEP: "+ Arrays.toString(a) + " pivot : " + a[j]);
    }

    private int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true)
        {
            while (a[++i]< a[lo])
                if (i == hi) break;
            while (a[lo]< a[--j])
                if (j == lo) break;
            if (i >= j) break;
            ExamLauncher.swap(a, i, j);
        }
        ExamLauncher.swap(a, lo, j);
        return j;
    }


}
