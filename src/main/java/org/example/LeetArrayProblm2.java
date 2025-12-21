package org.example;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
 */

public class LeetArrayProblm2 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        //int[] arr = {-1, 10, 1, 2, -1, -4};
        int sum = 1;
        boolean matchFound = false;
        for (int outerloop = 0; outerloop < arr.length; outerloop++) {
            for (int middleloop = outerloop+1; middleloop < arr.length; middleloop++) {
                for (int innerloop = middleloop+1; innerloop < arr.length; innerloop++) {
                    sum = arr[outerloop] + arr[middleloop] + arr[innerloop];
                    if(arr[outerloop]!=arr[middleloop] && arr[outerloop]!=arr[innerloop] && arr[middleloop]!=arr[innerloop] && sum==0){
                        matchFound = true;
                        System.out.println(arr[outerloop]+" , "+arr[middleloop]+" , "+ arr[innerloop]);
                        break;
                    }
                }
            }
        }
        if(!matchFound){
            System.out.println("No triplet match found with sum 0");
        }
    }
}
