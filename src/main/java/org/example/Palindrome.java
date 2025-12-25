package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String S = "madam";
        String reverseString;
//        for(int i=S.length()-1;i>=0;i--){
//            reverseString = reverseString.concat(String.valueOf(S.charAt(i)));
//        }
        StringBuilder sb = new StringBuilder(S);
        reverseString = String.valueOf(sb.reverse());

        if(S.equals(reverseString)){
            System.out.println("String '"+S+"' is Palindrome");
        }
        else {
            System.out.println("String '"+S+"' is not Palindrome");
        }

    }
}
