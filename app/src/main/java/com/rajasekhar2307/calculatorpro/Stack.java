package com.rajasekhar2307.calculatorpro;

public class Stack<T> {
    private int maxSize;
    private T[] stackArray;
    public int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = (T[])new Object[maxSize];
        top = -1;
    }

    public void push(T j) {
        stackArray[++top] = j;
    }
    public T pop() {
        return stackArray[top--];
    }
    public T peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}