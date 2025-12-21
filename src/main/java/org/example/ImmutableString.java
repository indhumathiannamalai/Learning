package org.example;

public class ImmutableString {

    public static void main(String[] args) {
         String s = "Akash";
         s.concat(" Ramanathan");
         System.out.println("String before assigning to reference : "+s);
         s = s.concat(" Ramanathan");
         System.out.println("String after assigning to reference : "+s);
    }
}
