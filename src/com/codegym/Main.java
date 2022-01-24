package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();
        System.out.println("Nhập c");
        int c = scanner.nextInt();
        try {
            triAngle(a, b, c);
            System.out.println("Là 3 cạnh 1 tam giác");

        }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }

    public static void triAngle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + b <= b || b + c <= a){
           throw new IllegalTriangleException();
        }
    }
}
