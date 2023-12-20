package org.example;

import java.util.HashSet;
import java.util.Set;

public class Block15 {
    public static void main(String[] args) {
        //        task 1
        System.out.println("task 1");
        int count = 0;

        for (int A = 6; ; A++) {
            boolean isTrue = true;

            for (int x = 0; x >= 0; x++) {
                if (!(x < A && x * x < 81)) {
                    isTrue = false;
                    break;
                }
            }

            if (!isTrue) {
                break;
            }

            count++;
        }

        System.out.println(count);

        //task 3
        System.out.println("task 3");

        Set<Integer> P = new HashSet<>();
        P.add(1);
        P.add(3);
        P.add(5);
        P.add(7);
        P.add(9);
        P.add(11);
        P.add(13);
        P.add(15);
        P.add(17);
        P.add(19);
        P.add(21);

        Set<Integer> Q = new HashSet<>();
        Q.add(3);
        Q.add(6);
        Q.add(9);
        Q.add(12);
        Q.add(15);
        Q.add(18);
        Q.add(21);
        Q.add(24);
        Q.add(27);
        Q.add(30);

        Set<Integer> A1 = new HashSet<>(P);
        A1.removeAll(Q);

        int sum = 0;
        for (int element : A1) {
            sum += element;
        }

        System.out.println(sum);

        //task 6
        System.out.println("task 6");
        System.out.println("""
        Для какого наибольшего целого неотрицательного числа A выражение

        (x > A) ∨ (y > A) ∨ (2y + x < 110)

        тождественно истинно, то есть принимает значение 1 при любых целых неотрицательных x и y?
        """);
        int A = 0;
        int x = 23;
        int y = 45;
        while(true) {
            if(!(x > A) || !(y > A) || !(2*y + x < 110)) {
                break;
            }
            A++;
        }
        System.out.println("Наибольшее значение A: " + (A - 1));

        // task 12
        System.out.println("task 12");

        x = 0;
        y = 0;
        A = 0;
        int c = 0;
        int s = 0;
        int max = 1000;
//        2_147_483_647

        boolean formula1 = (!(x < A) || (x*x < 100)) && (!(y*y <= 64) || (y <= A));
        for (int i = 0; i < max; i++) {
            if(formula1){
                for (int j = 0; j < max; j++) {
                    if(formula1){
                        for (int k = 0; k < max; k++) {
                            c++;
                            y++;
                            if (c % 1000000 == 0){
                                s++;
//                                System.out.println(s);
                            }
                        }
                    }
                    x++;
                }
            }
            A++;
        }
        System.out.println(c);



        // task 13
        System.out.println("task 13");
        System.out.println("""
        На числовой прямой даны два отрезка:
        P = [17, 46] и Q = [22, 57].
        Отрезок A таков, что приведённая ниже формула истинна при любом значении переменной х:

        ¬(x ∈ A) →(((x ∈ P) ⋀ (x ∈ Q)) → (x ∈ A))

        Какова наименьшая возможная длина отрезка A?
        """);
        int pStart = 17;
        int pEnd = 46;
        int qStart = 22;
        int qEnd = 57;

        int aStart = pStart;
        int aEnd = pEnd;
        int minLength = Integer.MAX_VALUE;

        for (int i = aStart; i <= aEnd; i++) {
            boolean formula = !((i >= aStart && i <= aEnd) &&
                    ((i >= pStart && i <= pEnd) &&
                            (i >= qStart && i <= qEnd)) &&
                    !(i >= aStart && i <= aEnd));

            if (formula) {
                int length = aEnd - aStart;
                if (length < minLength) {
                    minLength = length;
                }
            }
        }

        System.out.println("Наименьшая возможная длина отрезка A: " + minLength);

        // task 16
        System.out.println("task 16");
        int n = 0;
        int m = 0;
        int a1 = Integer.MAX_VALUE;
        boolean formula = (2*m + 3*n > 40) || ((m < a1) && (n <= a1));
        int col = 0;
        while(true){
            while(formula){
                a1--;
                col++;
                if(col > 2147483645){
                    break;
                }
            }
            if(col > 2147483645){
                break;
            }
            col = 0;
            m++;
            n++;
        }
        System.out.println(a1);
        System.out.println(formula);

        //task 19
        System.out.println("\ntask 19");

        pStart = 2;
        pEnd = 10;
        qStart = 6;
        qEnd = 14;

        aStart = pStart;
        aEnd = pEnd;
        minLength = Integer.MAX_VALUE;

        for (int i = aStart; i <= aEnd; i++) {
            formula = ((i >= aStart && i <= aEnd) && (i >= pStart && i <= pEnd)) || (i >= qStart && i <= qEnd);

            if (formula) {
                int length = aEnd - aStart;
                if (length < minLength) {
                    minLength = length;
                }
            }
        }

        System.out.println("Наименьшая возможная длина отрезка A: " + minLength);


    }
}
