package org.eclipse.che.examples;

import java.util.Scanner;

public class Test {
    public static void main(String... argvs) {
        System.out.println(isPalindrome(11));
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

    public static double area (double radius){
        double areaCircle = -1;
        if (radius>=0){
            areaCircle = radius * radius * Math.PI;
        }
        return areaCircle;
    }

    public static double area (double x, double y){
        double areaSquare = -1;
        if (x>=0 && y>=0){
            areaSquare = x * y;
        }
        return areaSquare;
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long days = (long) minutes / (24 * 60);
            long years = (long) days / (365);
            days = (long) days % (365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int p1, int p2, int p3){
        if (p1 < 0 || p2<0 || p3<0){
            System.out.println("Invalid Value");
        } else if ((p1 == p2) && (p1 == p3) && (p2 == p3)){
            System.out.println("All numbers are equal");
        } else if ((p1 != p2) && (p1 != p3) && (p2 != p3)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean catPlaying = false;
        if (temperature >= 25 && (temperature <= 35 || (temperature <= 45 && summer))){
            catPlaying =  true;
        }
        return catPlaying;
    }

    public static boolean isOdd(int number){
        boolean odd = false;
        if (number % 2 != 0 && number > 0){
            odd =  true;
        }
        return odd;
    }

    public static int sumOdd(int start, int end){
        int oddSum = -1;
        if(start>0 && end >0 && end>= start){
            oddSum = 0;
            for (int i=start;i<=end;i++){
                if (isOdd(i)){
                    oddSum += i;
                }
            }
        }
        return oddSum;
    }

    public static int sumDigits(int number){
        int result = -1;
        String numberString = ((Integer)number).toString();
        if(number >= 10){
            result = 0;
            for (int i=0;i<numberString.length();i++){
                result += (int)numberString.charAt(i);
            }
        }
        return result;
    }

    public static boolean isPalindrome(int number){
        boolean result = false;
        String numberString;
        String reverse = "";
        if (number < 0 ) {
            number = -1*number;
        }
        numberString = ((Integer)number).toString();
        for (int i=numberString.length()-1;i>=0;i--){
            reverse += Character.toString(numberString.charAt(i));
        }
        if (reverse.equals(numberString)){result =true;}
        return result;
    }

}