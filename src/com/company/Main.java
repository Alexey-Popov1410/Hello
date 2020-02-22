package com.company;

public class Main {

    public static void main(String[] args) {
        printArguments(args);
    }

    private static void printArguments(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
