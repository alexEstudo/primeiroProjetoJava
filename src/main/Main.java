package main;

import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int a = input.nextInt();
        
        final int x = a;
        
        do{
            n = input.nextInt();
        }while(n <= 0);

        for(int c = 1; c < n; c++){
            a+= x + c;
        }
        
        System.out.println(a);
        
        // alteração feita pelo site
        
        // Alteração feita pelo netBeans
    }
}
