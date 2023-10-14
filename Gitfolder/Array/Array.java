//  taking  array from 

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Deffingin the size of aaray
        System.out.println("Enter the Array size");
        int size = sc.nextInt();
        int [] number = {2,3,1,5,7};
        // Defining the array
        // int number[] = new int [size];

        // Takking the array input from the use
        for(int i = 0; i< number.length; i++){
            number[i]= sc.nextInt();
        }
        // System.out.print("Enter the number to serach");
            // int Serach =sc.nextInt();
            int Serach =9;
        sc.close();
        for(int i = 0; i< number.length; i++){
            for ( int  j = 0; j<number.length; j++ ){
                 if (number[i]+number[j]==Serach && i!= j){
                    
            }
            }
           
    
        }



    }
}
