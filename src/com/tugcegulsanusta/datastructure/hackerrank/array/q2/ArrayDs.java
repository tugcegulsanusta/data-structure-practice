package com.tugcegulsanusta.datastructure.hackerrank.array.q2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     *
     * https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here


        List<Integer> reversed = new LinkedList<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            reversed.add(a.get(i));
        }
        return reversed;
    }

}

public class ArrayDs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Solution.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
