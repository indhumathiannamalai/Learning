package org.example;

public class FindTargetElementInArray {
    public static void main(String[] args) {
        int[] num = {23,45,24,67};
        int target = 100;
        boolean targetFound = false;
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                targetFound =true;
                System.out.println("Target "+target+" found at index : "+i);
                break;
            }
        }
        if(!targetFound)
            System.out.println("Target "+target+" not found");
    }
}
