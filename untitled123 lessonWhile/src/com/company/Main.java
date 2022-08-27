package com.company;

import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws InterruptedException {

     Scanner scanner = new Scanner(in);
        System.out.println("phone ");
        System.out.println("Call->1 ");
        System.out.println("phone history->2 ");
        System.out.println("= ");
    int n = scanner.nextInt();
    switch (n){
        case 1 ->{
            System.out.println("dial the number ");
            System.out.print(" +998 ");
            int number = scanner.nextInt();
            Thread.sleep(2500);
            System.out.println("tuuuuuuuuuut");
            Thread.sleep(2500);
            System.out.println("tuuuuuuuuuut");
            Thread.sleep(2500);
            System.out.println("tuuuuuuuuuut");
            Thread.sleep(2500);
            System.out.println("tuuuuuuuuuut");
            Thread.sleep(2500);
            System.out.println("tut tut tut tut " +
                    "Call fowared ");
        }
        case 2->{
            System.out.println("phone history");
            LocalTime localTime = LocalTime.now();
            
        }
    }



    }


}


