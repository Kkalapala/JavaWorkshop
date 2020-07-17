package com.packtpub.recursion;

public class RunForever {
    public int add(int num) {
        if (num < 100) {
            return add(num + 1);
        }
        return num;
    }

    public static void main(String[] args) {
        RunForever runForever = new RunForever();

        System.out.println(runForever.add(1));
    }
}
