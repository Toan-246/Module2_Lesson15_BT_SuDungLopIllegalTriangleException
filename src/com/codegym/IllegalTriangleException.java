package com.codegym;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Số nhập vào không phải 3 cạnh của 1 tam giác");
    }
}
