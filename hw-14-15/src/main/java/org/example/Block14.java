package org.example;

public class Block14 {
    public static void main(String[] args) {
        // Block 14
        // task 4
        System.out.println("task 4");
        int i = 27;
        System.out.println(translation(i, 4));

        // task 11
        System.out.println("\ntask 11");
        int n1 = convertToDecimal("100",5);
        int n2 = convertToDecimal("200",4);
        int x = n2 - n1;
        System.out.println(x);

        // task 12
        System.out.println("\ntask 12");
        System.out.println(translation(83,3));

        // task 14
        System.out.println("\ntask 14");
        String number = "110";
        int decimal = 12;

        int base = 0;
        for (int g = 2; g <= 10; g++) {
            String convertedNumber = convertToBase(decimal, g) + "";
            if (number.equals(convertedNumber)) {
                base = g;
                break;
            }
        }

        System.out.println(base);

        // task 15
        System.out.println("\ntask 15");
        System.out.println(translation(38,5));
    }

    public static long translation (long i , int notation){
        String str = "";
//        System.out.println(i);
        while (i > 0){
            //&& i < notation*-1
//            System.out.print(i + " ");
            long b = i % notation;
            str = b + str;
            i = i / notation;
        }
        long l = Long.parseLong(str);
        return l;
    }

    public static int convertToDecimal(String number, int base) {
        int decimal = 0;
        int power = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = getDecimalValue(number.charAt(i));
            decimal += digit * Math.pow(base, power);
            power++;
        }
        return decimal;
    }

    private static int getDecimalValue(char digit) {
        if (Character.isDigit(digit)) {
            return Character.getNumericValue(digit);
        } else {
            return digit - 'A' + 10;
        }
    }

    public static String convertToBase(int decimal, int base) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % base;
            sb.insert(0, remainder);
            decimal = decimal / base;
        }
        return sb.toString();
    }
}