package org.example;

import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int num[] = {23, 34, 67, 45, 24};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of array of elements is " + sum);
        System.out.println("Total number of elements in array is " + num.length);
        System.out.println("The average of the array elements is: " + sum / num.length);
    }
}