package org.example;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Ramanathan";
        String s2 = "Ramanathan";
        System.out.print("s1 == s2 ? ");
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) ? "+s1.equals(s2));
        String s3 = new String("Ramanathan");
        String s4 = new String("Ramanathan");
        System.out.print("s3 == s4 ? ");
        System.out.println(s3 == s4);
        System.out.println("s3.equals(s4) ? "+s3.equals(s4));
        System.out.print("s1 == s3 ? ");
        System.out.println(s1 == s3);
        System.out.println("s1.equals(s3) ? "+s1.equals(s3));
    }
}
