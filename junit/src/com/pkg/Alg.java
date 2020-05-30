package com.pkg;

import java.lang.annotation.Annotation;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;


public class Alg {
    public BitSet genEratosthenes(int n) {
        //int n is the cap for prime numbers
        BitSet b = new BitSet(n);
        //bit sets for speed
        b.clear();
        double endOfIteration = Math.sqrt(n) + 1;
        //stopping point of bitset iteration very early, the
        //square root of n is the benchmark
        for (int a = 1; a < endOfIteration; a++) {
            if (b.get(a + 1) == false) {
                //checks to see if current number is unmarked, if
                //it is it is prime
                for (int j = (a + 2); j < n + 1; j++) {
                    //if number is prime, all multiples of that
                    //number are flagged
                    if ((j % (a + 1)) == 0) {
                        b.set(j, true);
                        //flag
                    }
                }
            }

        }
        return b;
    }

    public BitSet genSundaram(int n) {
        int m = ((n - 2) / 2);
        //endpoint number for this sundaram
        BitSet b = new BitSet(m);
        b.clear();
        //this algorithm flags all entries in the for loop
        //using the formula i + j + 2ij
        for (int i = 1; i <= m + 1; i++) {
            //i is less than or equal to the int m used above
            for (int j = i; j <= (m - i) / ((2 * i) + 1) + 1; j++) {
                //j is equal to i and is less a form that
                //((m - i) / ((2 * i) + 1) + 1)
                //so it runs smoothly
                int index = (i + j + 2 * i * j);
                //bit array is flagged at i + j + 2ij
                if (index <= m) {
                    //another check to ensure the algorithm
                    //does not go outside its bounds
                    b.set(index, true);
                    //flag
                }
            }
        }
        return b;
    }

    public void fileConstructorSundaram(int n) {
        long start_time = System.currentTimeMillis();
        //writes start time
        BitSet print = genSundaram(n);
        //generates sudram bitset
        PrintWriter pw = null;
        //file
        try {
            pw = new PrintWriter("primesSundaram.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //file
        pw.println("Sundaram Solution:");
        System.out.println("Sundaram Solution:");
        String string_line = " 2";
        //sudram dose not account for 2 as a prime
        int int_line = 1;
        for (int i = 1; i <= ((n - 2) / 2) + 1; i++) {
            //itterates through sudram bitset
            if (print.get(i) == false) {
                //checks flag in sudram set
                if ((2 * i + 1) <= n) {
                    //checks if prime is out of bounds

                    int_line++;
                    string_line = string_line + " " + (2 * i + 1);
                    //does sudram calculation 2i+1
                    if (int_line > 10) {
                        int_line = 0;
                        pw.println(string_line);
                        System.out.println(string_line);
                        string_line = "";
                    }
                    //puts in nice lines of primes
                }
            }
        }
        if (!string_line.equals("")) {
            pw.println(string_line);
            System.out.println(string_line);
        }
        //also for putting in nice lines
        long end_time = System.currentTimeMillis();
        //writes end time
        String calculatedtime = "Whoah man, that took " +
                (end_time - start_time) + " milliseconds to execute... Yikes!";
        //great joke
        pw.println(calculatedtime);
        System.out.println(calculatedtime);
        pw.close();
        //close file writer
    }

    public void fileConstructorEratosthenes(int n) {
        long start_time = System.currentTimeMillis();
        //writes start time
        BitSet print = genEratosthenes(n);
        //gets erato bitset
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("primesEratosthenes.txt",
                    "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //for file
        System.out.println("Eratosthenes Solution:");
        pw.println("Eratosthenes Solution:");
        String string_line = "";
        //makes it "pretty"
        int int_line = 0;
        for (int i = 2; i <= n; i++) {
            //itterate thrugh bitset and get primes
            if (print.get(i) == false) {
                int_line++;
                string_line = string_line + " " + i;

                if (int_line > 10) {
                    int_line = 0;
                    pw.println(string_line);
                    System.out.println(string_line);
                    string_line = "";
                }
            }
        }
        if (!string_line.equals("")) {
            pw.println(string_line);
            System.out.println(string_line);
        }
        //makes nice lines
        long end_time = System.currentTimeMillis();
        //writes end time
        String calcTime = "Whoah man, that took " + (end_time -
                start_time) + " milliseconds to execute... Yikes!";
        //HAHAHAHAH
        pw.println(calcTime);
        System.out.println(calcTime);
        pw.close();
    }
}
