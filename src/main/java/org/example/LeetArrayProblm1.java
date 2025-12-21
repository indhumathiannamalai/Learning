package org.example;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class LeetArrayProblm1 {
    public static void main(String[] args) {
        int[] arr = {11, 15, 5, 4, 8, 1 };
        int target = 9;
        int sum = 0;
        boolean matchFound = false;
        // outerloop has fixedVal which will be summed up with other values in the array one by one
        for (int outerloop = 0; outerloop < arr.length; outerloop++) {
            for(int innerloop = outerloop+1; innerloop < arr.length; innerloop++) {
                sum = arr[outerloop] + arr[innerloop];
                if(sum == target) {
                    System.out.println(arr[outerloop]+" + "+arr[innerloop]);
                    matchFound = true;
                    break;
                }
            }
        }
        if(!matchFound) {
            System.out.println("Target sum value "+target+" not found in array");
        }
    }
}



