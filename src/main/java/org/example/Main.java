package org.example;

public class Main {
    public static void main(String[] args) {
       // String contactArray[] = {"Gustav", "Hans","Dieter"};

        Friend contactA = new Friend(5265624, "Gustav");
        Friend contactB = new Friend(52352362, "Hans");
        Friend contactC = new Friend(35236252, "Dieter");
        Friend contactArray[] = new Friend[]{contactA, contactB, contactC};

        Smartphone testSmartphone = new Smartphone("testPhone", "Samapple", contactArray );
        System.out.println(testSmartphone.toString());
        System.out.println(testSmartphone.startRadio());
        System.out.println(testSmartphone.stopRadio());
        System.out.println(testSmartphone.getPosition());


    }
}
