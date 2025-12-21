package org.example;

public class FindMaxMinValInArray {

    public static void main(String[] args) {
        int[] num = {10,45,245,23,646};
        int fixedVal;
        int compVal;

        for(int outerloop=0;outerloop<num.length;outerloop++){
            fixedVal = num[outerloop];
            for(int innerloop=outerloop+1;innerloop<num.length;innerloop++){
                compVal = num[innerloop];
                if(compVal > fixedVal){
                    fixedVal = compVal;
                }
            }
            System.out.println("Max Val is "+fixedVal);
            break;
        }

        for(int outerloop=0;outerloop<num.length;outerloop++){
            fixedVal = num[outerloop];
            for(int innerloop=outerloop+1;innerloop<num.length;innerloop++){
                compVal = num[innerloop];
                if(compVal < fixedVal){
                    fixedVal = compVal;
                }
            }
            System.out.println("Min Val is "+fixedVal);
            break;
        }
    }
}
