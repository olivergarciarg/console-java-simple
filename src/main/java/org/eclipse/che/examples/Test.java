package org.eclipse.che.examples;

public class Test {
    public static void main(String... argvs) {
        String a = "Che";
        System.out.println("Hello World " + a + "!");
        areEqualByThreeDecimalPlaces(1.1,1.2);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return ((long)(1000*num1)==(long)(1000*num2));
    }

    public static boolean hasEqualSum(int n1, int n2, int n3){
        return ((n1+n2)==(n3));
    }

    public static boolean isTeen(int n){
        return ((n>=13 && n<=19));
    }

    public static boolean hasTeen(int n1, int n2, int n3){
        return (isTeen(n1)||isTeen(n2)||isTeen(n3));
    }
}