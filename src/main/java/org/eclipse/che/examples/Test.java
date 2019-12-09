package org.eclipse.che.examples;

import java.util.Scanner;

public class Test {
    public static void main(String... argvs) {
        System.out.println(sumFirstAndLastDigit(1));
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

    public static int sumFirstAndLastDigit(int number){
        int result = -1;
        String numberString;
        if (number >= 0 ) {
            numberString = ((Integer)number).toString();
            result = Character.getNumericValue(numberString.charAt(0)) + Character.getNumericValue(numberString.charAt(numberString.length()-1));
        }
        return result;
    }

    public static int getEvenDigitSum(int number){
        int result = -1;
        if (number >= 0 ) {
            String numberString = ((Integer)number).toString();
            result = 0;
            for (int i=0;i<numberString.length();i++){
                if (("2468").contains(Character.toString(numberString.charAt(i))))
                result += Character.getNumericValue(numberString.charAt(i));
            }
        }
        return result;
    }

    public static boolean hasSharedDigit(int n1, int n2){
        boolean result = false;
        if (n1 >= 10 && n1<=99 && n2 >= 10 && n2<=99) {
            String n1String = ((Integer)n1).toString();
            String n2String = ((Integer)n2).toString();
            for (int i=0;i<n2String.length();i++){
                if ((n1String).contains(Character.toString(n2String.charAt(i)))){
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        boolean result = false;
        if (n1 >= 10 && n1<=1000 && n2 >= 10 && n2<=1000) {
            String n1String = ((Integer)n1).toString();
            String n2String = ((Integer)n2).toString();
            String n3String = ((Integer)n3).toString();
            char n1LastChar = n1String.charAt(n1String.length()-1);
            char n2LastChar = n2String.charAt(n2String.length()-1);
            char n3LastChar = n3String.charAt(n3String.length()-1);
            result = ((n1LastChar == n2LastChar)||(n1LastChar == n3LastChar)||(n2LastChar == n3LastChar));
        }
        return result;
    }

    public static boolean isValid(int n1){
        return (n1 >= 10 && n1<=1000);
    }

    public static int getGreatestCommonDivisor(int n1, int n2){
        int divisor = -1;
        int min = Math.min(n1,n2);
        int max = Math.max(n1,n2);
        if(min>=10){
            for (int i = 2;i<=(int)(min/2);i++){
                if((n1%i==0)&&(n2%i==0)){
                    divisor = i;
                }
            }
            if(max%min==0){
                divisor = min;
            }
        }
        return divisor;
    }

}