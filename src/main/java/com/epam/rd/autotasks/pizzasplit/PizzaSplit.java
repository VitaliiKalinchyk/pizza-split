package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people=scanner.nextInt();
        int slices=scanner.nextInt();
        int n=1;
        while(slices*n%people!=0){
            n++;
        }
        System.out.println(n);
    }
}
