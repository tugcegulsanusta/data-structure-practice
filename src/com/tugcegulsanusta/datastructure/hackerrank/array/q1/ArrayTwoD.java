package com.tugcegulsanusta.datastructure.hackerrank.array.q1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> aSum = new ArrayList<>();
        for (int i = 1; i < arr.size() -1; i++) {
            for (int j = 1; j < arr.size() -1; j++) {
                aSum.add(  //[x-1][x][x+1]
                        arr.get(i-1).get(j-1) +
                        arr.get(i-1).get(j)   +
                        arr.get(i-1).get(j+1) +
                        arr.get(i).get(j)     +
                        arr.get(i+1).get(j-1) +
                        arr.get(i+1).get(j)   +
                        arr.get(i+1).get(j+1)
                );
            }
        }
        return Collections.max(aSum);
    }

}

public class ArrayTwoD {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Solution.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
