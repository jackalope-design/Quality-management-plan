package com.pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Alg a = new Alg();
        System.out.println("Hey, to what number do ya want?");
        //input the number, this will find primes up to that
        //number using the two
        //different algorithms
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        //reads input
        a.fileConstructorSundaram(num);
        System.out.println("\n\n\n---\n\n\n");
        a.fileConstructorEratosthenes(num);
        //generates the files and terminal output for both sets
        System.out.println();
    }
}