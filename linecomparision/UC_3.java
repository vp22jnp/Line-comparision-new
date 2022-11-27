package com.linecomparision;

import java.util.Scanner;

public  class UC_3 {
    public static class a{}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        float x1 = sc.nextInt();
        System.out.println("enter y1");
        float y1 = sc.nextInt();
        System.out.println("enter x2");
        float x2 = sc.nextInt();
        System.out.println("enter y2");
        float y2 = sc.nextInt();
        double LENGTH1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("lenth of the line is -" +LENGTH1);
        System.out.println("enter detailes of another line to check equals or not");
        System.out.println("enter x3");
        float x3 = sc.nextInt();
        System.out.println("enter y3");
        float y3 = sc.nextInt();
        System.out.println("enter x4");
        float x4 = sc.nextInt();
        System.out.println("enter y4");
        float y4 = sc.nextInt();
        double LENGTH2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        System.out.println("lenth of the line is -" +LENGTH2);
        if (LENGTH1 == LENGTH2) {
            System.out.println("lines are equal");
        } else if (LENGTH1 < LENGTH2) {
            System.out.println("lines 1 is smaller than line 2");
        } else if (LENGTH1 > LENGTH2) {
            System.out.println("line 1 is greater than line 2");
        } else {
            System.out.println("lines are not equal");
        }
    }


    }



