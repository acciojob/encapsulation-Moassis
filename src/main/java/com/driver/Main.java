package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Rommel");

        // name is declared private, so it is showing error,
        // we need to remove private or call the name by getter function

        System.out.println(obj.getName());
    }

}