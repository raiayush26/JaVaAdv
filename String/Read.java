// package com.ayush;
import java.io.BufferedReader;
import java.io.InputStreamReader;


// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.util.Scanner;
//  Variour kind  taking input from user   in java
public class Read {
    public static void main(String[] args) throws Exception {
        // String str = "";
        // int i=0;
        // Scanner sc =new Scanner(System.in);

        // i = Integer.parseInt(sc.nextLine());// taking as String convert to int
        System.out.print("Enter the number :-");

        InputStreamReader is = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(is);
        int n  =  Integer.parseInt(br.readLine());     
        
        
        System.out.print("my nuber is "+ n);
    }
}
