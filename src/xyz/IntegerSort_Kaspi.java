package xyz;

import java.util.Arrays;

public class IntegerSort_Kaspi {
    public static void main (String[] args){
        int n = 123654;
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Character.getNumericValue(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(array));
    }
}
