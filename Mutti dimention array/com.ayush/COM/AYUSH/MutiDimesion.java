package COM.AYUSH;

import java.util.Arrays;
import java.util.Scanner;

public class MutiDimesion{
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int[][] arr = new int[3][3];
   int [][] arr1 ={
        {1,2,3}, //0
        {4,5,5,8}, //1
        {7,8,9} //2
   };
for (int i = 0; i < arr1.length; i++) {
    System.out.print(Arrays.toString(arr1[i])+" ");
    
}
//     input in 2 d array
    for(int i=0; i<arr.length;i++){
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = in.nextInt(); 
        }
}
//  out put
for(int i=0; i<arr.length;i++){
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

}}
